package com.csvdata.largecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
	
public class ReadLargeCSV {
    public static void main(String[] args) {
	//  file path
	String filePath = "src/com/csvdata/largecsv/bigfile.csv";
	int count = 0;
	int batchSize = 100;

	try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    String line;
	    boolean isHeader = true;

	    while ((line = reader.readLine()) != null) {
		// skip header row
		if (isHeader) {
		    isHeader = false;
		    continue;
		}
		count++;

		// process in batches of 100
		if (count % batchSize == 0) {
		    System.out.println("Records processed: " + count);
		}
	    }
	    // print final count
	    System.out.println("Total records processed: " + count);

	} catch (IOException e) {
	    System.out.println("Error reading large CSV file");
	}
    }
}