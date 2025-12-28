package com.constructors.levelone;

public class Manager extends Employee {

	// constructor
    public Manager(int employeeID, String department, double salary) {
    	// calling parent class constructor 
        super(employeeID, department, salary);
    }

    // accessing  public and protected members
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }

    // main method
    public static void main(String[] args) {
        Manager manager = new Manager(111, "IT", 80000);

        manager.displayManagerDetails();

        manager.setSalary(95000);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}

    
