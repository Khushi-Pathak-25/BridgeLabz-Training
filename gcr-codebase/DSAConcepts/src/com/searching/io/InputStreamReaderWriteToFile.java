package com.searching.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamReaderWriteToFile {

	public static void main(String[] args) {

		// file location
		String filePath = "src/com/searching/io/output.txt";

		// Try-with-resources ensures streams are closed automatically
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				FileWriter writer = new FileWriter(filePath)) {

			String input;

			System.out.println("Enter text (type 'exit' to stop):");

			// Read input until user types "exit"
			while (true) {

				input = br.readLine();

				if (input.equals("exit")) {
					break;
				}

				// Write input to file with new line
				writer.write(input + System.lineSeparator());
			}

			System.out.println("Input successfully written to file.");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
