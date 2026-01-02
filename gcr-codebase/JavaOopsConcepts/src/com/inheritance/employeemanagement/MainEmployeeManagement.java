/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, 
like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
*/

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