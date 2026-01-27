package com.csvdata.duplicatecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class DetectDuplicateCSV {
    public static void main(String[] args) {
	// sample file path
        String filePath = "src/com/csvdata/duplicatecsv/students.csv";
        HashSet<String> ids = new HashSet<>();

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
                String id = arr[0];

                // check duplicate ID
                if (ids.contains(id)) {
                    System.out.println("Duplicate record found: " + line);
                } else {
                    ids.add(id);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}