package com.exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstLine {
	public static void main(String[] args) {
		String filePath = "src/com/exceptionhandling/trywithresources/info.txt";

		// try-with-resources automatically closes BufferedReader
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			// Read and print the first line
			String firstLine = reader.readLine();
			if (firstLine != null) {
				System.out.println(firstLine);
			}

		} catch (IOException e) {
			// Handles file not found or read errors
			System.out.println("Error reading file");
		}
	}
}