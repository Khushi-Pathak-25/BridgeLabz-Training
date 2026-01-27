package com.csvdata.mergecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class MergeStudentCSV {
    public static void main(String[] args) {
	// sample files paths
	String file1 = "src/com/csvdata/mergecsv/students1.csv";
	String file2 = "src/com/csvdata/mergecsv/students2.csv";
	String outputFile = "src/com/csvdata/mergecsv/merged_students.csv";

	HashMap<String, String[]> map = new HashMap<>();

	try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
		BufferedReader reader2 = new BufferedReader(new FileReader(file2));
		FileWriter writer = new FileWriter(outputFile)) {

	    String line;
	    boolean isHeader = true;

	    // read first CSV (ID, Name, Age)
	    while ((line = reader1.readLine()) != null) {
		if (isHeader) {
		    isHeader = false;
		    continue;
		}

		String[] arr = line.split(",");
		map.put(arr[0], arr);
	    }

	    isHeader = true;

	    // write header to merged file
	    writer.write("ID,Name,Age,Marks,Grade\n");

	    // read second CSV (ID, Marks, Grade)
	    while ((line = reader2.readLine()) != null) {
		if (isHeader) {
		    isHeader = false;
		    continue;
		}

		String[] arr = line.split(",");

		// merge records based on ID
		if (map.containsKey(arr[0])) {
		    String[] student = map.get(arr[0]);
		    writer.write(student[0] + "," + student[1] + "," + student[2] + "," + arr[1] + "," + arr[2] + "\n");
		}
	    }
	    System.out.println("CSV files merged successfully");

	} catch (IOException e) {
	    System.out.println("Error merging CSV files");
	}
    }
}