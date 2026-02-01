package com.interfaces.functional.backgroundjob;

public class Job {
    private String jobName;
    private int durationSeconds;

    // constructor
    public Job(String jobName, int durationSeconds) {
	this.jobName = jobName;
	this.durationSeconds = durationSeconds;
    }

    // method to start job execution
    public void execute() {
	System.out.println(jobName + " started (Thread: " + Thread.currentThread().getName() + ")");
	try {
	    Thread.sleep(durationSeconds * 1000L);
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt();
	}
	System.out.println(jobName + " completed");
    }

    // good string representation
    @Override
    public String toString() {
	return "Job[name=" + jobName + ", duration=" + durationSeconds + "s]";
    }
}