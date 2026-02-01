package com.interfaces.defaultmethods.dataexport;

public interface ReportExporter {

    // original abstract methods - must be implemented
    void export(String data, String fileName);

    // default method added later for JSON support
    // old exporters don't need to implement/override it
    default void exportToJSON(String data, String fileName) {
        System.out.println("JSON export not yet implemented for this exporter type.");
        System.out.println("-> Falling back to default behavior for: " + fileName);
        System.out.println("Data (JSON preview): " + data.substring(0, Math.min(data.length(), 50)) + "...");
        System.out.println("Please use a JSON-capable exporter or update this implementation.");
    }
}