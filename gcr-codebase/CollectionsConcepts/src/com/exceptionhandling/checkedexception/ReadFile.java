package com.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		String filePath = "src/com/exceptionhandling/checkedexception/data.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;

			// Read and print file contents
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			// Handles file not found or read error
			System.out.println("File not found");
		}
	}
}