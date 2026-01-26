package com.annotations.taskinfo;

public class TaskManager {
    // Method annotated with TaskInfo
    @TaskInfo(priority = "HIGH", assignedTo = "Ringo")
    public void completeTask() {
        System.out.println("Task is being completed.");
    }
}