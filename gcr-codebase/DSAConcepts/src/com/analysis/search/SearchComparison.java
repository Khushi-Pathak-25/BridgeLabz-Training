package com.analysis.search;

import java.util.Arrays;

public class SearchComparison {
	public static void main(String[] args) {
		int n = 1_000_000;
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = i;
		}

		int target = n - 1;

		// Linear Search
		long startLinear = System.nanoTime();
		int linearResult = LinearSearch.search(data, target);
		long endLinear = System.nanoTime();

		// Binary Search
		Arrays.sort(data);
		long startBinary = System.nanoTime();
		int binaryResult = BinarySearch.search(data, target);
		long endBinary = System.nanoTime();

		System.out.println("Linear Search Index : " + linearResult);
		System.out.println("Linear Search Time  : " + (endLinear - startLinear) + " ns");
		System.out.println();
		System.out.println("Binary Search Index : " + binaryResult);
		System.out.println("Binary Search Time  : " + (endBinary - startBinary) + " ns");
	}
}