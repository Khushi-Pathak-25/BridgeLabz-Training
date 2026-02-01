package com.interfaces.defaultmethods.dataexport;

public class JsonExporter implements ReportExporter {

    @Override
    public void export(String data, String fileName) {
        System.out.println("JSON Export -> Writing data to " + fileName + ".json");
        System.out.println("Sample JSON structure: {\"report\": \"" + data.substring(0, 30) + "...\"}");
        System.out.println("Export completed (JSON format)");
    }

    @Override
    public void exportToJSON(String data, String fileName) {
        System.out.println("JSON Export (native support) -> Writing to " + fileName + ".json");
        System.out.println("JSON content preview: " + data.substring(0, Math.min(data.length(), 50)) + "...");
        System.out.println("Export completed successfully (JSON)");
    }
}