package com.exceptionhandling.finallyblock;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// Take user input
			System.out.print("Enter first number: ");
			int num1 = input.nextInt();

			System.out.print("Enter second number: ");
			int num2 = input.nextInt();

			// Perform division
			int result = num1 / num2;
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {
			// Handles division by zero
			System.out.println("Error: Cannot divide by zero.");

		} finally {
			// Always executed
			System.out.println("Operation completed");
			input.close();
		}
	}
}