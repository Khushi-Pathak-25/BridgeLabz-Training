package com.csvdata.sortcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SortEmployeeCSV {
    public static void main(String[] args) {
	// file path
	String filePath = "src/com/csvdata/writecsv/employees.csv";
	ArrayList<String[]> records = new ArrayList<>();

	try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    String line;
	    boolean isHeader = true;

	    while ((line = reader.readLine()) != null) {

		// skip header row
		if (isHeader) {
		    isHeader = false;
		    continue;
		}

		// split CSV line and store
		String[] arr = line.split(",");
		records.add(arr);
	    }

	    // sort records by salary in descending order
	    for (int i = 0; i < records.size() - 1; i++) {
		for (int j = i + 1; j < records.size(); j++) {

		    int salary1 = Integer.parseInt(records.get(i)[3]);
		    int salary2 = Integer.parseInt(records.get(j)[3]);

		    // swap if salary is smaller
		    if (salary1 < salary2) {
			String[] temp = records.get(i);
			records.set(i, records.get(j));
			records.set(j, temp);
		    }
		}
	    }

	    System.out.println("Top 5 highest paid employees:");

	    // print top 5 records
	    for (int i = 0; i < 5 && i < records.size(); i++) {
		String[] emp = records.get(i);
		System.out.println(
			"ID: " + emp[0] + ", Name: " + emp[1] + ", Department: " + emp[2] + ", Salary: " + emp[3]);
	    }

	} catch (IOException e) {
	    System.out.println("Error reading CSV file");
	}
    }
}