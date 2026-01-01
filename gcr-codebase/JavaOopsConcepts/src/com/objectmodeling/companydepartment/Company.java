package com.objectmodeling.companydepartment;

import java.util.ArrayList;

public class Company {

	String companyName;
	ArrayList<Department> departments;

	// Constructor to initialize company
	public Company(String companyName) {
		this.companyName = companyName;
		departments = new ArrayList<>();
	}

	// Method to create department inside company
	public void addDepartment(String departmentName) {
		// composition
		Department department = new Department(departmentName);
		departments.add(department);
	}

	// Method to add employee to a specific department
	public void addEmployeeToDepartment(int deptIndex, int empId, String empName) {
		departments.get(deptIndex).addEmployee(empId, empName);
	}

	// Method to display company structure
	public void displayCompany() {
		System.out.println("\nCompany Name: " + companyName);

		// Loop to display all departments
		for (Department department : departments) {
			department.displayDepartment();
		}
	}

	// Method to delete company
	public void deleteCompany() {
		departments.clear(); // Empty the list
		System.out.println("\nCompany deleted. All departments and employees removed.");
	}
}
