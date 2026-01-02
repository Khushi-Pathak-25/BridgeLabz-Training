package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Person {
    
	// attributes
    protected String name;
    protected int age;

    // Constructor to initialize common person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic person details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    // Method to be overridden by subclasses
    public void displayRole() {
        System.out.println("Role : Person");
    }
}
