package com.searching.algorithms;

import java.util.Arrays;

public class LinearSearchWordInSentences {

	// Returns first sentence containing the word
	public static String searchWord(String[] sentences, String word) {

		// Traverse each sentence
		for (int i = 0; i < sentences.length; i++) {

			// Check if sentence contains the word
			if (sentences[i].contains(word)) {
				return sentences[i];
			}
		}

		return "Not Found";
	}

	public static void main(String[] args) {

		String[] sentences = { "Java is a object-oriented programming language", "Java is robust",
				"Java is developed by James Josling", "Java has strong memory management" };

		String word = "James";

		System.out.println("Sentences:");
		System.out.println(Arrays.toString(sentences));

		String result = searchWord(sentences, word);

		System.out.println("Result:");
		System.out.println(result);
	}
}
