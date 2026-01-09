package com.searching.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderReadLineByLine {

    public static void main(String[] args) {

    	// file to read
        String filePath = "src/com/searching/io/input.txt"; 

        // Try-with-resources ensures file is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
