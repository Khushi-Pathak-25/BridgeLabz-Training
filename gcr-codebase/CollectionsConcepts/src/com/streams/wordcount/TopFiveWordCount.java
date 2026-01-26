package com.streams.wordcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TopFiveWordCount {
	public static void main(String[] args) {
		String filePath = "src/com/streams/wordcount/largefile_10MB.txt";

		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Read file and count words
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;

			// Read file line by line
			while ((line = reader.readLine()) != null) {

				// Split line into words (special characters ignored)
				String[] words = line.toLowerCase().split("\\W+");

				for (String word : words) {
					if (!word.isEmpty()) {
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}

		// Sort words by frequency
		List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());

		Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return b.getValue() - a.getValue(); // descending order
			}
		});

		// Display top 5 words
		System.out.println("Top 5 most frequent words:");

		int count = 0;
		for (Map.Entry<String, Integer> entry : wordList) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			count++;
			if (count == 5) {
				break;
			}
		}
	}
}