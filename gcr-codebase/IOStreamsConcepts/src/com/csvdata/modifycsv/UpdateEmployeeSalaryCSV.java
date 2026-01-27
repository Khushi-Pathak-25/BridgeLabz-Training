package com.csvdata.modifycsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {
    public static void main(String[] args) {
	// sample file path
	String inputFile = "src/com/csvdata/writecsv/employees.csv";
	String outputFile = "src/com/csvdata/modifycsv/updated_employees.csv";

	try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		FileWriter writer = new FileWriter(outputFile)) {

	    String line;
	    boolean isHeader = true;
	    while ((line = reader.readLine()) != null) {

		// write header as it is
		if (isHeader) {
		    writer.write(line + "\n");
		    isHeader = false;
		    continue;
		}

		// split CSV line
		String[] arr = line.split(",");

		String department = arr[2];
		double salary = Double.parseDouble(arr[3]);

		// increase salary for IT department
		if (department.equalsIgnoreCase("IT")) {
		    salary = salary + (salary * 0.10);
		}

		// write updated record
		writer.write(arr[0] + "," + arr[1] + "," + department + "," + (int) salary + "\n");
	    }
	    System.out.println("Updated CSV file created successfully");

	} catch (IOException e) {
	    
	    System.out.println("Error processing CSV file");
	}
    }
}