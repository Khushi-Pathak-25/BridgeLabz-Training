package com.objectmodeling.companydepartment;

public class Employee {

	String employeeName;
	int employeeId;

	// Constructor to initialize employee
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	// Method to display employee details
	public void displayEmployee() {
		System.out.println("Employee ID   : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
	}
}
