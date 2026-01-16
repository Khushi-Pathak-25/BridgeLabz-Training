package com.dayfive.cinemahouse;

public class BubbleSort {

	public static void bubbleSort(int screenTimes[]) {
		int length = screenTimes.length;
		boolean swapped;

		for (int i = 0; i < length - 1; i++) {
			swapped = false;
			for (int j = 0; j < length - 1 - i; j++) {
				if (screenTimes[j] > screenTimes[j + 1]) {
					int temp = screenTimes[j];
					screenTimes[j] = screenTimes[j + 1];
					screenTimes[j + 1] = temp;

					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}

	}
	
	public static void display(int screenTimes[]) {
		System.out.print("Sorted Show Times (in PM): ");
		for(int value : screenTimes) {
			System.out.print(value+" ");
		}
	}
}
