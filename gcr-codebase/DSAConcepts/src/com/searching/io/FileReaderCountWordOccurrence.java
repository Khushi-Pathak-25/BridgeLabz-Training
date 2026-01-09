package com.searching.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderCountWordOccurrence {

	public static void main(String[] args) {

		// file location
		String filePath = "src/com/searching/io/Input.txt"; 
		// word to search
		String targetWord = "Java"; 
		int count = 0;

		// Try-with-resources ensures file is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Split line into words
				String[] words = line.split("[^a-zA-Z]+");

				// Check each word
				for (String word : words) {
					if (word.equalsIgnoreCase(targetWord)) {
					    count++;
					}
				}
			}

			System.out.println("Word \"" + targetWord + "\" appears " + count + " times.");

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
