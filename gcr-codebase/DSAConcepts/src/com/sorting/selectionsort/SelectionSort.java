package com.sorting.selectionsort;

public class SelectionSort {

	// Selection Sort to sort array
	public static void sort(int[] arr) {

		int n = arr.length;

		// Move boundary of unsorted part
		for (int i = 0; i < n - 1; i++) {

			// Assume current index is minimum element
			int minIndex = i;

			// Find minimum element & update minIndex
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap minimum with first unsorted element
			swap(arr, i, minIndex);
		}
	}

	// Swaps two elements in array
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}