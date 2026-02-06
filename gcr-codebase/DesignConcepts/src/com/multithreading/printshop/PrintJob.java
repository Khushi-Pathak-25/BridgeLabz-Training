package com.multithreading.printshop;

public class PrintJob implements Runnable {

    private String jobName;
    private int pages;
    private int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {

        String priorityLevel;

        if (priority >= 7) {
            priorityLevel = "[High Priority]";
        } else if (priority >= 5) {
            priorityLevel = "[Medium Priority]";
        } else {
            priorityLevel = "[Low Priority]";
        }

        // 🔒 ONLY ONE JOB CAN PRINT HERE
        Printer.print(jobName, pages, priorityLevel);
    }
}
