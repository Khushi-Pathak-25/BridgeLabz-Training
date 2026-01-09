package com.searching.algorithms;

import java.util.Arrays;

public class LinearSearchFirstNegative {

	// Returns index of first negative number
	public static int findFirstNegative(int[] arr) {

		// Traverse array from start
		for (int i = 0; i < arr.length; i++) {

			// Check if element is negative
			if (arr[i] < 0) {
				return i;
			}
		}

		return -1; // no negative number found
	}

	public static void main(String[] args) {

		int[] arr = { 7, -1, 3, 9, -6, -8 };

		System.out.print("Array: ");
		System.out.println(Arrays.toString(arr));

		int index = findFirstNegative(arr);

		if (index != -1) {
			System.out.println("First negative number found at index: " + index);
		} else {
			System.out.println("No negative number found");
		}
	}
}
