package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Person {

	// attributes
    protected String name;
    protected int id;

    // Constructor to initialize person details
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display common details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}