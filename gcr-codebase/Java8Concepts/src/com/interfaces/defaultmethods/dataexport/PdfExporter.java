package com.interfaces.defaultmethods.dataexport;

public class PdfExporter implements ReportExporter {

    @Override
    public void export(String data, String fileName) {
        System.out.println("PDF Export -> Generating " + fileName + ".pdf");
        System.out.println("Content preview: " + data.substring(0, Math.min(data.length(), 60)) + "...");
        System.out.println("Export completed (PDF format)");
    }

    // Does NOT override exportToJSON → uses default implementation
}