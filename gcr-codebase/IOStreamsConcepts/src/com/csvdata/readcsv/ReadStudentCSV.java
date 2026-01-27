package com.csvdata.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
    public static void main(String[] args) {
	// sample file path
	String filePath = "src/com/csvdata/readcsv/students.csv";

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

		// print structured output
		System.out.println("ID: " + arr[0] + ", Name: " + arr[1] + ", Age: " + arr[2] + ", Marks: " + arr[3]);
	    }

	} catch (IOException e) {
	    System.out.println("Error reading CSV file");
	}
    }
}