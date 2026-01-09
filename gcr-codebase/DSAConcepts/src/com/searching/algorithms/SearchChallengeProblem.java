package com.searching.algorithms;

import java.util.Arrays;

public class SearchChallengeProblem {

	// Finds the first missing positive integer
	public static int findFirstMissingPositive(int[] arr) {

		int n = arr.length;
		boolean[] present = new boolean[n + 1];

		// Mark positive numbers as present
		for (int value : arr) {
			if (value > 0 && value <= n) {
				present[value] = true;
			}
		}

		// Find first missing positive
		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				return i;
			}
		}

		return n + 1;
	}

	// Binary search for target index
	public static int binarySearch(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, -1, 11, 6};
		int target = 4;

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr));

		// Linear Search task
		int missing = findFirstMissingPositive(arr);
		System.out.println("First missing positive integer: " + missing);

		// Binary Search task
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(arr));

		int index = binarySearch(arr, target);

		if (index != -1) {
			System.out.println("Target " + target + " found at index: " + index);
		} else {
			System.out.println("Target not found");
		}
	}
}