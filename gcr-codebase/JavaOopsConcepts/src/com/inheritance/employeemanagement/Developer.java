package com.inheritance.employeemanagement;

public class Developer extends Employee {

	// attribute
    private String programmingLanguage;

    // Constructor to initialize developer details
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden method with developer-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Language  : " + programmingLanguage);
    }
}