package com.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HighestValueKey {

	public static void main(String[] args) {

		// Creating a map to store key-value pairs
		Map<String, Integer> map = new HashMap<>();

		// Adding values into the map
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);

		// Variable to store the key which has maximum value
		String maxKey = null;

		// Variable to store the maximum value
		// Initialized with minimum possible value
		int maxValue = Integer.MIN_VALUE;

		// Loop through each entry of the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			// Check if current value is greater than the max value
			if (entry.getValue() > maxValue) {

				// Update max value
				maxValue = entry.getValue();

				// Update key related to max value
				maxKey = entry.getKey();
			}
		}

		// Printing the key which has the highest value
		System.out.println("Key with highest value: " + maxKey);
	}
}
