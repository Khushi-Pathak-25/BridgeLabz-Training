package com.interfaces.defaultmethods.dataexport;

public class CsvExporter implements ReportExporter {

    @Override
    public void export(String data, String fileName) {
        System.out.println("CSV Export -> Writing data to " + fileName + ".csv");
        System.out.println("Sample CSV line: " + data.replace("\n", ", "));
        System.out.println("Export completed (CSV format)");
    }

    // Does NOT override exportToJSON -> uses default implementation
}