package com.streams.serialization;

import java.io.Serializable;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Department: " + department +
            ", Salary: " + salary
        );
    }
}
