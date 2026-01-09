package com.searching.algorithms;

import java.util.Arrays;

public class BinarySearchRotationPoint {

	// Returns index of smallest element (rotation point)
	public static int findRotationPoint(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		// Binary search
		while (left < right) {

			// mid calculation (safe)
			int mid = left + (right - left) / 2;

			// Smallest element is in right half
			if (arr[mid] > arr[right]) {
				left = mid + 1;
			}
			// Smallest element is in left half (including mid)
			else {
				right = mid;
			}
		}

		// left == right points to smallest element
		return left;
	}

	public static void main(String[] args) {

		int[] arr = {51, 65, 68, 89, 10, 36};

		System.out.println("Rotated Array:");
		System.out.println(Arrays.toString(arr));

		int index = findRotationPoint(arr);

		System.out.println("Rotation point index: " + index);
		System.out.println("Smallest element: " + arr[index]);
	}
}