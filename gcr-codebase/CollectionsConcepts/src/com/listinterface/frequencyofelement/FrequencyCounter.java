package com.listinterface.frequencyofelement;

import java.util.*;

public class FrequencyCounter {
	
	// Using HashMap to find frequency of elements
	public static Map<String, Integer> countFrequency(List<String> list) {
		Map<String, Integer> frequencyMap = new LinkedHashMap<>();

		for (String item : list) {
			frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
		}
		return frequencyMap;
	}

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

		System.out.println("Input     : " + items);
		System.out.println("Frequency : " + countFrequency(items));
	}
}
