package com.inheritance.employeemanagement;

public class Employee {
    
	// attributes
    protected String name;
    protected int id;
    protected double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details {to be overridden}
    public void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}