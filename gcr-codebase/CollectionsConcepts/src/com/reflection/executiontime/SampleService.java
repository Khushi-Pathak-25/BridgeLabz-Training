package com.reflection.executiontime;

public class SampleService {
    // Method whose execution time will be measured
    public void slowTask() {
	for (int i = 0; i < 40_000_000; i++) {
	}
	System.out.println("Slow task completed.");
    }
}