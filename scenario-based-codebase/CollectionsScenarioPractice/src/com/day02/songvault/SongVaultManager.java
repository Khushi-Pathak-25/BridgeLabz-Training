package com.day02.songvault;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Comparator;

import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongVaultManager<T extends Media> {
	// all songs
	private List<T> allSongs;

	// genre -> list of songs
	private Map<String, List<T>> songsByGenre;

	// unique artists
	private Set<String> uniqueArtists;

	// constructor
	public SongVaultManager() {
		allSongs = new ArrayList<>();
		songsByGenre = new HashMap<>();
		uniqueArtists = new HashSet<>();
	}

	// read folder and load .txt song files
	@SuppressWarnings("unchecked")
	public void loadSongsFromFolder(String folderPath) throws IOException {
		File folder = new File(folderPath);
		File[] files = folder.listFiles();

		if (files == null || files.length == 0) {
			System.out.println("No files found in folder");
			return;
		}

		// regex patterns for each field
		Pattern titlePattern = Pattern.compile("Title:\\s*(.+)");
		Pattern artistPattern = Pattern.compile("Artist:\\s*(.+)");
		Pattern durationPattern = Pattern.compile("Duration:\\s*(.+)");
		Pattern genrePattern = Pattern.compile("Genre:\\s*(.+)");

		for (File file : files) {
			if (!file.isFile() || !file.getName().toLowerCase().endsWith(".txt")) {
				continue;
			}

			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line;
				String title = null, artist = null, duration = null, genre = null;

				while ((line = br.readLine()) != null) {
					line = line.trim();
					if (line.isEmpty())
						continue;

					Matcher m;

					if ((m = titlePattern.matcher(line)).matches()) {
						title = m.group(1);
					} else if ((m = artistPattern.matcher(line)).matches()) {
						artist = m.group(1);
					} else if ((m = durationPattern.matcher(line)).matches()) {
						duration = m.group(1);
					} else if ((m = genrePattern.matcher(line)).matches()) {
						genre = m.group(1);
					}
				}

				// create song only if all fields are present
				if (title != null && artist != null && duration != null && genre != null) {
					Song song = new Song(title, artist, duration, genre);

					// cast to T (safe since T extends Media, warning suppressed)
					allSongs.add((T) song);

					// group by genre
					songsByGenre.computeIfAbsent(genre, _ -> new ArrayList<>()).add((T) song);

					// collect unique artists
					uniqueArtists.add(artist);
				} else {
					
					System.out.println("Incomplete song skipped: " + file.getName());
				}

			} catch (IOException e) {
				
				System.out.println("Error reading " + file.getName() + ": " + e.getMessage());
			}
		}
	}

	// show all songs sorted by title
	public void showAllSongsSorted() {
		System.out.println("All Songs (sorted by title):");
		System.out.println("----------------------------------------------------------------------------");

		allSongs.stream().sorted(Comparator.comparing(Media::getTitle)).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");
	}

	// show songs in a specific genre
	public void showSongsByGenre(String genre) {
		List<T> songs = songsByGenre.getOrDefault(genre, new ArrayList<>());
		
		System.out.println("\nSongs in genre \"" + genre + "\" (" + songs.size() + "):");
		
		songs.forEach(System.out::println);
	}

	// show unique artists (sorted)
	public void showUniqueArtists() {
		System.out.println("\nUnique Artists (alphabetical):");
		
		uniqueArtists.stream().sorted().forEach(System.out::println);
		
		System.out.println("Total unique artists: " + uniqueArtists.size());
	}

	// example filter: songs longer than given duration (e.g., "5:00")
	public void showLongSongs(String minDuration) {
		System.out.println("\nSongs longer than " + minDuration + ":");
		allSongs.stream().filter(s -> compareDuration(s.getDuration(), minDuration) > 0).forEach(System.out::println);
	}

	// duration comparison method (MM:SS)
	private int compareDuration(String d1, String d2) {
		String[] p1 = d1.split(":");
		String[] p2 = d2.split(":");
		int min1 = Integer.parseInt(p1[0]) * 60 + Integer.parseInt(p1[1]);
		int min2 = Integer.parseInt(p2[0]) * 60 + Integer.parseInt(p2[1]);
		return Integer.compare(min1, min2);
	}
}