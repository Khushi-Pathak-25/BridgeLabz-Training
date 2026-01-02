package com.inheritance.employeemanagement;

public class Intern extends Employee {
    
	// attribute
    private int durationMonths;

    // Constructor to initialize intern details
    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    // Overridden method with intern-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration  : " + durationMonths + " months");
    }
}
