package com.sorting.insertionsort;

public class OptimizedInsertionSort {
	
	// Optimized Insertion Sort 
	public static void sort(int[] arr) {

		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int current = arr[i];

			// If already in correct position, skip shifting
			if (arr[i - 1] <= current) {
				continue;
			}

			int j = i - 1;

			// Shift only when needed
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = current;
		}
	}
}