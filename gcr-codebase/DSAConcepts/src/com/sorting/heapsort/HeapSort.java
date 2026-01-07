package com.sorting.heapsort;

public class HeapSort {

    // Heap Sort to sort an array in ascending
    public static void sort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            swap(arr, 0, i);

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // method to heapify max heap 
    private static void heapify(int[] arr, int size, int root) {

        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        // Check left child
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check right child
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        // Swap and continue heapifying
        if (largest != root) {
            swap(arr, root, largest);
            
            heapify(arr, size, largest);
        }
    }
    
	// Swaps two elements in array
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}