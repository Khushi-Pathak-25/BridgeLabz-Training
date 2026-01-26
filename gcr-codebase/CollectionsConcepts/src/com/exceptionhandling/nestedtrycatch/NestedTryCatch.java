package com.exceptionhandling.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };

		try {
			// Take index input
			System.out.print("Enter array index: ");
			int index = input.nextInt();

			try {
				// Take divisor input
				System.out.print("Enter divisor: ");
				int divisor = input.nextInt();

				// Perform division
				int result = arr[index] / divisor;
				System.out.println("Result: " + result);

			} catch (ArithmeticException e) {
				// Handles division by zero
				System.out.println("Cannot divide by zero!");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handles invalid index
			System.out.println("Invalid array index!");
		}
		
		input.close();
	}
}
