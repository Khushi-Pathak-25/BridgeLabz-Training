package com.interfaces.functional.backgroundjob;

import java.util.Scanner;

public class BackgroundJobApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Background Job Execution Demo (using Runnable)");
	System.out.println("Enter number of background jobs to run (1-5): ");
	int numJobs = input.nextInt();

	if (numJobs < 1 || numJobs > 5) {
	    System.out.println("Invalid number. Exiting.");
	    input.close();
	    return;
	}

	System.out.println("\nStarting " + numJobs + " background jobs...\n");

	// Create and start jobs using Runnable lambdas
	for (int i = 1; i <= numJobs; i++) {
	    String jobName = "Report-Generation-" + i;
	    int duration = 2 + i; // increasing duration for demo

	    Job job = new Job(jobName, duration);

	    // Use Runnable functional interface with lambda
	    Runnable task = () -> job.execute();

	    // Run in a separate thread (asynchronous execution)
	    Thread thread = new Thread(task);
	    thread.setName("Worker-" + i);
	    thread.start();
	}

	System.out.println("All background jobs started. Main thread continues...");
	System.out.println("Main thread will wait for 10 seconds before exiting demo.\n");

	// Simulate main thread doing other work
	try {
	    Thread.sleep(10000); // 10 seconds
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt();
	}

	System.out.println("\nMain thread finished. Some background jobs may still be running.");
	System.out.println("Note: In real applications, you would use ThreadPoolExecutor or ExecutorService for better control.");

	input.close();
    }
}