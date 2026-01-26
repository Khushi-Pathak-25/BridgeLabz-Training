package com.annotations.importantmethod;

public class ServiceTasks {

    // Important method with default level
    @ImportantMethod
    public void backupDatabase() {
        System.out.println("Database backup completed.");
    }

    // Important method with custom level
    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Report generated.");
    }
}