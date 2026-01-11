package com.analysis.sorting;

import java.util.Arrays;

public class SortingComparison {
	public static void main(String[] args) {
		int n = 10_000;
		int[] original = new int[n];

		for (int i = 0; i < n; i++) {
			original[i] = n - i;
		}

		// Bubble Sort
		int[] bubbleArray = Arrays.copyOf(original, original.length);
		long startBubble = System.nanoTime();
		BubbleSort.sort(bubbleArray);
		long endBubble = System.nanoTime();

		// Merge Sort
		int[] mergeArray = Arrays.copyOf(original, original.length);
		long startMerge = System.nanoTime();
		MergeSort.sort(mergeArray);
		long endMerge = System.nanoTime();

		// Quick Sort
		int[] quickArray = Arrays.copyOf(original, original.length);
		long startQuick = System.nanoTime();
		QuickSort.sort(quickArray);
		long endQuick = System.nanoTime();

		System.out.println("Bubble Sort Time : " + (endBubble - startBubble) + " ns");
		System.out.println("Merge Sort Time  : " + (endMerge - startMerge) + " ns");
		System.out.println("Quick Sort Time  : " + (endQuick - startQuick) + " ns");
	}
}
