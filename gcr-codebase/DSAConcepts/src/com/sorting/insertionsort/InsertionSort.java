package com.sorting.insertionsort;

public class InsertionSort {

    // Insertion Sort to sort array (Asc)
    public static void sort(int[] arr) {

        int n = arr.length;

        // Traverse from second element
        for (int i = 1; i < n; i++) {

            int current = arr[i];
            int j = i - 1;

            // Shift elements to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert element at correct position
            arr[j + 1] = current;
        }
    }
}