package com.collectors.employeesalary;

class Employee {
	
    private String name;
    private String department;
    private double salary;

    // Constructor
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}