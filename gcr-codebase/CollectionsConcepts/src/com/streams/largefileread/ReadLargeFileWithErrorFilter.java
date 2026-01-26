package com.streams.largefileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFileWithErrorFilter {
	public static void main(String[] args) {
		String filePath = "src/com/streams/largefileread/largefile.log";

		// Try-with-resources ensures proper closing
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Read file line by line
			while ((line = reader.readLine()) != null) {

				// Case-insensitive check for "error"
				if (line.toLowerCase().contains("error")) {
					System.out.println(line);
				}
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
