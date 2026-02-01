package com.interfaces.defaultmethods.dataexport;

import java.util.Scanner;

public class DataExportApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Reporting Module - Data Export Demo");
        System.out.println("Sample report data: Employee ID, Name, Salary, Department");
        String sampleData = "101,Abhinash,85000,Engineering\n102,Priya,62000,Marketing\n103,Rahul,92000,Finance";

        System.out.println("\nAvailable exporters:");
        System.out.println("1 - CSV Exporter (old, no JSON support)");
        System.out.println("2 - PDF Exporter (old, no JSON support)");
        System.out.println("3 - JSON Exporter (new, native JSON support)");
        System.out.print("Choose exporter (1-3): ");

        int choice = input.nextInt();
        input.nextLine(); // consume newline

        ReportExporter exporter;

        if (choice == 1) {
            exporter = new CsvExporter();
        } else if (choice == 2) {
            exporter = new PdfExporter();
        } else if (choice == 3) {
            exporter = new JsonExporter();
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        System.out.print("\nEnter output file name (without extension): ");
        String fileName = input.nextLine().trim();

        System.out.println("\nPerforming standard export...");
        exporter.export(sampleData, fileName);

        System.out.print("\nTry JSON export? (yes/no): ");
        String jsonChoice = input.nextLine().trim().toLowerCase();

        if (jsonChoice.equals("yes")) {
            System.out.println("\nPerforming JSON export...");
            exporter.exportToJSON(sampleData, fileName);
        }

        input.close();
    }
}