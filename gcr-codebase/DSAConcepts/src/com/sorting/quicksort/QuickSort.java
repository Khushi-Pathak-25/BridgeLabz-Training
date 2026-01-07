package com.sorting.quicksort;

public class QuickSort {

	// Quick Sort to sort the array
	public static void sort(int[] arr, int low, int high) {

		if (low < high) {

			// Partition the array
			int pivotIndex = partition(arr, low, high);

			// Sort left part
			sort(arr, low, pivotIndex - 1);

			// Sort right part
			sort(arr, pivotIndex + 1, high);
		}
	}

	// Places pivot at correct position
	private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        // Move smaller elements to the left of pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place pivot at its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

	// Swaps two elements in array
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}