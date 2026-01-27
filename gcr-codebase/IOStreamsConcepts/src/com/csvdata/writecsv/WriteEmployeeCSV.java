package com.csvdata.writecsv;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
    public static void main(String[] args) {
	// sample file path
        String filePath = "src/com/csvdata//writecsv/employees.csv";

        try (FileWriter writer = new FileWriter(filePath)) {
            // write header
            writer.write("ID,Name,Department,Salary\n");

            // write employee records
            writer.write("101,Aru,HR,50000\n");
            writer.write("102,Nia,IT,70000\n");
            writer.write("103,Maira,Finance,55000\n");
            writer.write("104,Krish,IT,75000\n");
            writer.write("105,leena,Admin,60000\n");

            System.out.println("Employee data written to CSV file successfully");
        } catch (IOException e) {
            System.out.println("Error writing to CSV file");
        }
    }
}