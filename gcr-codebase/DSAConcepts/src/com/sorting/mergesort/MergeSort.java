package com.sorting.mergesort;

public class MergeSort {

    // Sorts the array using merge sort
    public static void sort(int[] prices, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            sort(prices, left, mid);

            // Sort right half
            sort(prices, mid + 1, right);

            // Merge both halves
            merge(prices, left, mid, right);
        }
    }

    // Merges two sorted halves
    private static void merge(int[] prices, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge arrays in sorted order
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k++] = leftArray[i++];
            } else {
                prices[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements from left array
        while (i < n1) {
            prices[k++] = leftArray[i++];
        }

        // Copy remaining elements from right array
        while (j < n2) {
            prices[k++] = rightArray[j++];
        }
    }
}