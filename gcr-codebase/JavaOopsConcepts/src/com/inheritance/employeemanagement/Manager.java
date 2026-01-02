package com.inheritance.employeemanagement;

public class Manager extends Employee {

	// attribute
    private int teamSize;

    // Constructor to initialize manager details
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overridden method with manager-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}