package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Staff extends Person {

	// attribute
    private String department;

    // Constructor to initialize staff details
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overridden method to describe staff role
    @Override
    public void displayRole() {
        System.out.println("Role       : Staff");
        System.out.println("Department : " + department);
    }
}