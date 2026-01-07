package com.sorting.bubblesort;

public class OptimizedBubbleSort {

    // Optimized Bubble Sort to sort array in ascending order
    public static void sort(int[] marks) {
    	int n = marks.length;
        boolean swapped;

        // Traverse array passes
        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if order is wrong
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // Stop if no swaps happened
            if (!swapped) {
                break;
            }
        }
    }
}