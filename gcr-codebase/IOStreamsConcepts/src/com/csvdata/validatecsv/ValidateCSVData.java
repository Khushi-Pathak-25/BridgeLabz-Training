package com.csvdata.validatecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
    public static void main(String[] args) {
	// sample file path
	String filePath = "src/com/csvdata/validatecsv/users.csv";

	// email regex pattern
	Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

	try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    String line;
	    boolean isHeader = true;

	    while ((line = reader.readLine()) != null) {
		// skip header row
		if (isHeader) {
		    isHeader = false;
		    continue;
		}

		// split CSV line
		String[] arr = line.split(",");

		String email = arr[2];
		String phone = arr[3];

		boolean validEmail = emailPattern.matcher(email).matches();
		boolean validPhone = phone.matches("\\d{10}");

		// print invalid rows
		if (!validEmail || !validPhone) {
		    System.out.println("Invalid row found: " + line);
		}
	    }

	} catch (IOException e) {
	    System.out.println("Error reading CSV file");
	}
    }
}