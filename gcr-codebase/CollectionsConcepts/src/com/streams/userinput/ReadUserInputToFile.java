package com.streams.userinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadUserInputToFile {
	public static void main(String[] args) {
		String filePath = "src/com/streams/userinput/userinfo.txt";

		// Try-with-resources ensures resources are closed properly
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				FileWriter writer = new FileWriter(filePath)) {

			// Read user input
			System.out.print("Enter your name: ");
			String name = reader.readLine();

			System.out.print("Enter your age: ");
			String age = reader.readLine();

			System.out.print("Enter your favorite programming language: ");
			String language = reader.readLine();

			// Write input to file
			writer.write("Name: " + name + System.lineSeparator());
			writer.write("Age: " + age + System.lineSeparator());
			writer.write("Favorite Programming Language: " + language + System.lineSeparator());

			System.out.println("User information saved successfully.");

		} catch (IOException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
	}
}