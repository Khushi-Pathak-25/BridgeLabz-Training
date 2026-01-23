
package com.mapinterface;

import java.util.*;

public class InvertMap {

	// This method converts Map<K, V> into Map<V, List<K>>
	public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {

		// New map where value becomes key
		// and keys are stored in a list
		Map<V, List<K>> invertedMap = new HashMap<>();

		// Loop through each entry of the original map
		for (Map.Entry<K, V> entry : map.entrySet()) {

			// Get original key and value
			K key = entry.getKey();
			V value = entry.getValue();

			// If the value is not present in inverted map,
			// create a new list for it
			if (!invertedMap.containsKey(value)) {
				invertedMap.put(value, new ArrayList<>());
			}

			// Add the key to the list of that value
			invertedMap.get(value).add(key);
		}

		// Return the inverted map
		return invertedMap;
	}

	public static void main(String[] args) {

		// Original map
		Map<String, Integer> input = new HashMap<>();
		input.put("A", 1);
		input.put("B", 2);
		input.put("C", 1);

		// Invert the map
		Map<Integer, List<String>> output = invertMap(input);

		// Print result
		System.out.println(output);
	}
}
