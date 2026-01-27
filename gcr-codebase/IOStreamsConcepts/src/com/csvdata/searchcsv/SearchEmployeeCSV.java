package com.csvdata.searchcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filePath = "src/com/csvdata//writecsv/employees.csv";
        boolean found = false;

        System.out.print("Enter employee name to search: ");
        String searchName = input.nextLine();

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

                // check name match
                if (arr[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + arr[2]);
                    System.out.println("Salary: " + arr[3]);
                    found = true;
                    break;
                }
            }

            // if record not found
            if (!found) {
                System.out.println("Employee not found");
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
        input.close();
    }
}