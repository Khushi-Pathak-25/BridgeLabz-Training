package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Student extends Person {

	// attribute
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overridden method to describe student role
    @Override
    public void displayRole() {
        System.out.println("Role  : Student");
        System.out.println("Grade : " + grade);
    }
}