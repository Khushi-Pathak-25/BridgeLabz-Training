package com.annotations.bugreport;

public class SampleService {

    // Method with multiple BugReport annotations
    @BugReport(description = "NullPointerException in edge case")
    @BugReport(description = "Performance issue for large input")
    public void processData() {
        System.out.println("Processing data...");
    }
}