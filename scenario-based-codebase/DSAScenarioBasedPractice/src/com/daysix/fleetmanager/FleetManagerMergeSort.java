package com.daysix.fleetmanager;

public class FleetManagerMergeSort {

	// Merge two sorted depot lists
	public static int[] mergeDepots(int depot1[], int depot2[]) {

		int n1 = depot1.length;
		int n2 = depot2.length;

		int merged[] = new int[n1 + n2];

		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {

			if (depot1[i] < depot2[j]) {
				merged[k++] = depot1[i++];
			} else {
				merged[k++] = depot2[j++];
			}
		}

		while (i < n1) {
			merged[k++] = depot1[i++];
		}

		while (j < n2) {
			merged[k++] = depot2[j++];
		}

		return merged;
	}

	// display master schedule
	public static void display(int mileage[]) {
		System.out.println("===== Master Maintenance Schedule =====");
		for (int value : mileage) {
			System.out.print(value + " ");
		}
	}
}