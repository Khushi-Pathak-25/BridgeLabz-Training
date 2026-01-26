package com.annotations.logexecutiontime;

public class PerformanceService {

    // Method whose execution time will be measured
    @LogExecutionTime
    public void heavyOperation() {

        // Simple loop to consume time
        for (int i = 0; i < 1_000_000; i++) {
        }

        System.out.println("Heavy operation completed.");
    }

    // Another method to compare time
    @LogExecutionTime
    public void lightOperation() {
        for (int i = 0; i < 1_000; i++) {
        }
        System.out.println("Light operation completed.");
    }
}