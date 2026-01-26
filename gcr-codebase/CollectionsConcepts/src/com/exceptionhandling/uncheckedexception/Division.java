package com.exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
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
			System.out.println("Error: Division by zero is not allowed.");

		} catch (InputMismatchException e) {
			// Handles non-numeric input
			System.out.println("Error: Please enter valid numeric values.");

		} finally {
			// Close scanner object
			input.close();
		}
	}
}