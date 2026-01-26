package com.junit.taskmanager;

public class TaskManager {
    public String longRunningTask() {

	try {
	    // Sleep for 3 seconds
	    Thread.sleep(3000);
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt();
	}

	return "Task completed";
    }
}