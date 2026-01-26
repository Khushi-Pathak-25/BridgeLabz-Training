package com.exceptionhandling.multiplecatch;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// Initialize array
			int[] arr = { 10, 20, 30, 40, 50 };

			// Take index input
			System.out.print("Enter index: ");
			int index = input.nextInt();

			// Access array element
			System.out.println("Value at index " + index + ": " + arr[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// Handles invalid index
			System.out.println("Invalid index!");

		} catch (NullPointerException e) {
			// Handles null array access
			System.out.println("Array is not initialized!");

		} finally {
			input.close();
		}
	}
}