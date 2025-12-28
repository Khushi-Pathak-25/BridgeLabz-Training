package com.constructors.levelone;

public class Employee {

	// Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Modify salary of employee
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Returns salary of employee
    public double getSalary() {
        return salary;
    }

    // Displays employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
