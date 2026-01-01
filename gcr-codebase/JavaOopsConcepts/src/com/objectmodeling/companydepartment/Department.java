package com.objectmodeling.companydepartment;

import java.util.ArrayList;

public class Department {
	
	    // attributes
		String departmentName;
		ArrayList<Employee> employees;

		// Constructor to initialize department
		public Department(String departmentName) {
			this.departmentName = departmentName;
			employees = new ArrayList<>();
		}

		// Method to add employee to department
		public void addEmployee(int id, String name) {
			Employee employee = new Employee(id, name);
			employees.add(employee);
		}

		// Method to display department details
		public void displayDepartment() {
			System.out.println("Department Name: " + departmentName);

			// Loop to display all employees in department
			for (Employee employee : employees) {
				System.out.println("--------------------");
				employee.displayEmployee();
			}
	    }
}


