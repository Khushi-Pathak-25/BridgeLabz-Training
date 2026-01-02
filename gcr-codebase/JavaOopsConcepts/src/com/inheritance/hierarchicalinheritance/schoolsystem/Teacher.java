package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person {

	// attribute
    private String subject;

    // Constructor to initialize teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overridden method to describe teacher role
    @Override
    public void displayRole() {
        System.out.println("Role    : Teacher");
        System.out.println("Subject : " + subject);
    }
}