package com.searching.algorithms;

import java.util.Arrays;

public class BinarySearchFirstLastOccurrence {

	// Finds first occurrence of target
	public static int findFirst(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				// store index
				result = mid;
				// move left to find first
				right = mid - 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}

	// Finds last occurrence of target
	public static int findLast(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				// store index
				result = mid;
				// move right to find last
				left = mid + 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 2, 2, 2, 3, 4, 5 };
		int target = 2;

		System.out.println("Array:");
		System.out.println(Arrays.toString(arr));

		int first = findFirst(arr, target);
		int last = findLast(arr, target);

		if (first == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("First occurrence index: " + first);
			System.out.println("Last occurrence index: " + last);
		}
	}
}
