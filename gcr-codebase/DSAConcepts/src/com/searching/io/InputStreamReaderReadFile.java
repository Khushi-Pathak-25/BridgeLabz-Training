package com.searching.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderReadFile {

	public static void main(String[] args) {

		// file to read
		String filePath = "src/com/searching/io/input.txt";

		// Try-with-resources closes all streams automatically
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
