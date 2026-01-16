package com.dayfive.robowarehouse;

public class InsertionSort {

	public static void insertionSort(int weights[]) {

		int weight = weights.length;
		
		for (int i = 1; i < weight; i++) {

			int current = weights[i];

			int j = i - 1;
			while (j >= 0 && current < weights[j]) {
				weights[j+1] = weights[j];
				j--;
			}
			weights[j+1]= current;
		}
	}
	
	public static void display(int weights[]) {
		
		System.out.println("Shelf order (Ascending by weight):");
		for(int value : weights) {
			System.out.print(value+" ");
		}
	}
}
