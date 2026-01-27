package com.csvdata.jsontocsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONCSVConverter {

    public static void main(String[] args) {
        convertJSONToCSV();
        convertCSVToJSON();
    }

    // Convert JSON to CSV
    public static void convertJSONToCSV() {
        String jsonFile = "src/com/csvdata/jsontocsv/students.json";
        String csvFile = "src/com/csvdata/jsontocsv/students_from_json.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
             FileWriter writer = new FileWriter(csvFile)) {

            // CSV Header
            writer.write("ID,Name,Age,Marks\n");

            String line;
            while ((line = reader.readLine()) != null) {
                // Remove curly braces and quotes
                line = line.replace("{", "").replace("}", "").replace("\"", "");
                String[] arr = line.split(",");

                String id = arr[0].split(":")[1];
                String name = arr[1].split(":")[1];
                String age = arr[2].split(":")[1];
                String marks = arr[3].split(":")[1];

                writer.write(id + "," + name + "," + age + "," + marks + "\n");
            }

            System.out.println("JSON to CSV conversion completed");

        } catch (IOException e) {
            System.out.println("Error converting JSON to CSV");
            e.printStackTrace();
        }
    }

    // Convert CSV to JSON
    public static void convertCSVToJSON() {
        // Corrected CSV file path (read the CSV generated from JSON)
        String csvFile = "src/com/csvdata/jsontocsv/students_from_json.csv";
        String jsonFile = "src/com/csvdata/jsontocsv/students_from_csv.json";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile));
             FileWriter writer = new FileWriter(jsonFile)) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue; // skip header
                }

                String[] arr = line.split(",");

                // Write JSON object
                writer.write("{");
                writer.write("\"ID\":" + arr[0] + ",");
                writer.write("\"Name\":\"" + arr[1] + "\",");
                writer.write("\"Age\":" + arr[2] + ",");
                writer.write("\"Marks\":" + arr[3]);
                writer.write("}\n");
            }

            System.out.println("CSV to JSON conversion completed");

        } catch (IOException e) {
            System.out.println("Error converting CSV to JSON");
            e.printStackTrace();
        }
    }
}
