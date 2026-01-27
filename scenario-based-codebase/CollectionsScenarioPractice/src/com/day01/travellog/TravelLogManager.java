package com.day01.travellog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogManager {
	private List<Trip> trips;

	// constructor
	public TravelLogManager() {
		trips = new ArrayList<>();
	}

	// add trip and save to file
	public void addTrip(Trip trip, String folder) throws IOException {
		trips.add(trip);
		saveToFile(trip, folder);
	}

	// save one trip to ser file
	private void saveToFile(Trip trip, String folder) throws IOException {
		File dir = new File(folder);
		if (!dir.exists())
			dir.mkdirs();

		String fileName = folder + "/" + trip.getCity() + "_" + trip.getCountry() + ".ser";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(trip);
		}
	}

	// load all trips from folder
	public void loadTrips(String folder) throws IOException, ClassNotFoundException {
		trips.clear();
		File dir = new File(folder);
		if (!dir.exists() || !dir.isDirectory())
			return;

		for (File file : dir.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".ser")) {
				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
					Trip trip = (Trip) ois.readObject();
					trips.add(trip);
				} catch (Exception e) {
					System.out.println("Skip bad file: " + file.getName());
				}
			}
		}
	}

	// find all cities using regex on notes
	public List<String> findCities() {
		// unique cities
		Set<String> allCities = new HashSet<>();

		// simple capitalized words as cities
		Pattern p = Pattern.compile("\\b[A-Z][a-z]+\\b");

		for (Trip t : trips) {
			Matcher m = p.matcher(t.getNotes());
			while (m.find()) {
				allCities.add(m.group());
			}
		}

		return new ArrayList<>(allCities);
	}

	// trips longer than 5 days
	public List<Trip> longTrips() {
		List<Trip> longOnes = new ArrayList<>();
		for (Trip t : trips) {
			if (t.getDuration() > 5) {
				longOnes.add(t);
			}
		}
		return longOnes;
	}

	// unique countries
	public Set<String> uniqueCountries() {
		Set<String> countries = new HashSet<>();
		for (Trip t : trips) {
			countries.add(t.getCountry());
		}
		return countries;
	}

	// top 3 cities by visit count
	public List<String> topCities() {
		Map<String, Integer> counts = new HashMap<>();
		for (Trip t : trips) {
			counts.put(t.getCity(), counts.getOrDefault(t.getCity(), 0) + 1);
		}

		// sort by count desc
		List<Map.Entry<String, Integer>> list = new ArrayList<>(counts.entrySet());
		list.sort((a, b) -> b.getValue() - a.getValue());

		List<String> top = new ArrayList<>();
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			top.add(list.get(i).getKey() + " (" + list.get(i).getValue() + ")");
		}
		return top;
	}
}