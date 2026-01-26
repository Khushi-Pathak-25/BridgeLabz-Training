package com.exceptionhandling.customexception;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = input.nextInt();

		try {
			// Call validation method
			AgeValidator.validateAge(age);
			System.out.println("Access granted!");

		} catch (InvalidAgeException e) {
			// Handle custom exception
			System.out.println(e.getMessage());
		}
		input.close();
	}
}