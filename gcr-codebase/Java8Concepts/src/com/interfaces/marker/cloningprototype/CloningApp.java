package com.interfaces.marker.cloningprototype;

import java.util.Scanner;

public class CloningApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// prototype objects
	Product originalProduct = new Product("P111", "KeyBoard", 2999.00, "Electronics");
	EmployeeProfile originalEmployee = new EmployeeProfile("E222", "Shagun", "Engineering", 5);

	System.out.println("Cloning Prototype Objects Demo (using Cloneable marker)");
	System.out.println("1 - Clone Product object");
	System.out.println("2 - Clone Employee Profile object");
	System.out.print("Choose object to clone (1-2): ");

	int choice = input.nextInt();

	try {
	    if (choice == 1) {
		System.out.println("\nOriginal: " + originalProduct);

		// create clone
		Product clonedProduct = originalProduct.clone();

		System.out.println("Cloned   : " + clonedProduct);

		// demonstrate independence (modify clone)
		clonedProduct = new Product(clonedProduct); // simulate change
		clonedProduct = new Product("P111-MOD", clonedProduct.getName() + " (Modified)", clonedProduct.getPrice() + 200,
			clonedProduct.getCategory());

		System.out.println("Modified clone: " + clonedProduct);
		System.out.println("Original unchanged: " + originalProduct);
	    } else if (choice == 2) {
		System.out.println("\nOriginal: " + originalEmployee);

		// create clone
		EmployeeProfile clonedEmployee = originalEmployee.clone();

		System.out.println("Cloned   : " + clonedEmployee);

		// demonstrate independence
		clonedEmployee = new EmployeeProfile(clonedEmployee); // simulate change
		clonedEmployee = new EmployeeProfile("E202-UPD", clonedEmployee.getName(),
			"Senior " + clonedEmployee.getDepartment(), clonedEmployee.getExperienceYears() + 1);

		System.out.println("Modified clone: " + clonedEmployee);
		System.out.println("Original unchanged: " + originalEmployee);
	    } else {
		System.out.println("Invalid choice.");
	    }
	} catch (CloneNotSupportedException e) {
	    System.out.println("Cloning not supported: " + e.getMessage());
	}

	input.close();
    }
}