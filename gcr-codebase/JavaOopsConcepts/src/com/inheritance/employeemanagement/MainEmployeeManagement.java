package com.inheritance.employeemanagement;

public class MainEmployeeManagement {

	public static void main(String[] args) {

	        // Polymorphism: parent class  reference holding different employee types
	        Employee emp1 = new Manager("Ringo", 111, 90000, 10);
	        Employee emp2 = new Developer("Aneek", 112, 70000, "Java");
	        Employee emp3 = new Intern("Richa", 113, 25000, 6);

	        emp1.displayDetails();
	        System.out.println("---------------------");

	        emp2.displayDetails();
	        System.out.println("---------------------");

	        emp3.displayDetails();
	    }
	}