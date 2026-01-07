package com.sorting.bubblesort;

public class BubbleSort {

    // Bubble Sort to sort array in ascending order
    public static void sort(int[] marks) {
        int n = marks.length;
 
        // Traverse array multiple times
        for (int i = 0; i < n - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if elements are in wrong order
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }
}