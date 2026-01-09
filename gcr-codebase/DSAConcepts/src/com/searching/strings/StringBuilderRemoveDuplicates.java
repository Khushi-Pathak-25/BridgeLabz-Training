package com.searching.strings;

import java.util.HashSet;

public class StringBuilderRemoveDuplicates {

	// Removes duplicate characters while maintaining order
	public static String removeDuplicates(String input) {

		StringBuilder sb = new StringBuilder();
		HashSet<Character> seen = new HashSet<>();

		// Traverse each character
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			// Add character only if not seen before
			if (!seen.contains(ch)) {
				sb.append(ch);
				seen.add(ch);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String input = "Java Data";
		System.out.println("Original String: " + input);

		String result = removeDuplicates(input);
		System.out.println("After Removing Duplicates: " + result);
	}
}