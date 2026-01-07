package com.sorting.countingsort;

public class CountingSort {

	// Counting Sort to sorts an array
	public static void sort(int[] arr) {

		int min = arr[0];
		int max = arr[0];

		// Find minimum and maximum values
		for (int value : arr) {
			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
		}

		int range = max - min + 1;
		int[] count = new int[range];

		// Store frequency of elements
		for (int value : arr) {
			count[value - min]++;
		}

		int index = 0;

		// Build sorted array
		for (int i = 0; i < range; i++) {
			while (count[i] > 0) {
				arr[index++] = i + min;
				count[i]--;
			}
		}
	}
}