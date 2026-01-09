package com.searching.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StringAndIOComparison {

	public static void main(String[] args) {

		int iterations = 1_000_000;
		String text = "hello";

		// StringBuilder
		StringBuilder sb = new StringBuilder();
		long sbStart = System.nanoTime();

		for (int i = 0; i < iterations; i++) {
			sb.append(text);
		}

		long sbEnd = System.nanoTime();
		long sbTime = sbEnd - sbStart;

		// StringBuffer
		StringBuffer buffer = new StringBuffer();
		long bufferStart = System.nanoTime();

		for (int i = 0; i < iterations; i++) {
			buffer.append(text);
		}

		long bufferEnd = System.nanoTime();
		long bufferTime = bufferEnd - bufferStart;

		System.out.printf("%-30s : %d%n", "StringBuilder Time (ns)", sbTime);
		System.out.printf("%-30s : %d%n", "StringBuffer Time (ns)", bufferTime);
		System.out.println();
		
		// File Reading, large text file
		String filePath = "src/com/searching/strings/LargeText.txt"; 
		int wordCount;

		// FileReader
		long fileReaderStart = System.nanoTime();
		wordCount = countWordsUsingFileReader(filePath);
		long fileReaderEnd = System.nanoTime();

		System.out.printf("%-30s : %d%n", "FileReader Word Count: ", wordCount);
		System.out.printf("%-30s : %d%n", "FileReader Time (ns): ", (fileReaderEnd - fileReaderStart));
		System.out.println();

		// InputStreamReader
		long inputStreamStart = System.nanoTime();
		wordCount = countWordsUsingInputStreamReader(filePath);
		long inputStreamEnd = System.nanoTime();

		System.out.printf("%-30s : %d%n", "InputStreamReader Word Count: ", wordCount);
		System.out.printf("%-30s : %d%n", "InputStreamReader Time (ns): ", (inputStreamEnd - inputStreamStart));
	}

	// Counts words using FileReader
	private static int countWordsUsingFileReader(String filePath) {
		int count = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				count += words.length;
			}

		} catch (IOException e) {
			System.out.println("FileReader Error: " + e.getMessage());
		}

		return count;
	}

	// Counts words using InputStreamReader
	private static int countWordsUsingInputStreamReader(String filePath) {

		int count = 0;

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				count += words.length;
			}

		} catch (IOException e) {
			System.out.println("InputStreamReader Error: " + e.getMessage());
		}

		return count;
	}
}
