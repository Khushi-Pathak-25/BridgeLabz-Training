package com.annotations.todo;

public class ProjectTasks {

    // Pending feature
    @Todo(task = "Implement login validation", assignedTo = "Ringo", priority = "HIGH")
    public void loginFeature() {
        
	System.out.println("Login feature stub.");
    }

    // Another pending feature
    @Todo(task = "Add export report option", assignedTo = "Mehul")
    public void exportReport() {
        
	System.out.println("Export report stub.");
    }
}