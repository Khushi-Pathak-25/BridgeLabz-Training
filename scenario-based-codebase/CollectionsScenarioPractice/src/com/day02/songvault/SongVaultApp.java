/*
 8. SongVault – Personal Music Library Manager
Story: Nina is a music enthusiast who collects .txt files, each representing a song in the
format:
Title: Bohemian Rhapsody
Artist: Queen
Duration: 5:55
Genre: Rock
With hundreds of such files, she wants to create SongVault, a desktop app that:
● Reads song files using I/O Streams
● Extracts fields using Regex
● Stores songs in a List<Song> and groups them by genre using Map<String,
List<Song>>
● Uses Set<String> to list unique artists
● Allows filtering and sorting using Java Streams
● Supports Generics for different types of media: audio, video, podcast
*/

package com.day02.songvault;

public class SongVaultApp {
    public static void main(String[] args) {
        SongVaultManager<Song> vault = new SongVaultManager<>();

        // sample folder path
        String songFolder = "samplefiles/songvault";

        try {
            vault.loadSongsFromFolder(songFolder);

            vault.showAllSongsSorted();
            vault.showSongsByGenre("Rock");
            vault.showUniqueArtists();

            // example filter
            vault.showLongSongs("5:00");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}