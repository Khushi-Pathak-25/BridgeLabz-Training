package com.dayeight.foodfest;

public class FoodFestMergeSort {

	public static void mergeSort(Stall stalls[], int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(stalls, left, mid);

			mergeSort(stalls, mid + 1, right);

			merge(stalls, left, mid, right);

		}
	}

	public static void merge(Stall stalls[], int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Stall L[] = new Stall[n1];
		Stall R[] = new Stall[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = stalls[i + left];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = stalls[j + mid + 1];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {

			if (L[i].footfall <= R[j].footfall) {
				stalls[k++] = L[i++];
			} else {
				stalls[k++] = R[j++];
			}
		}
		while (i < n1) {
			stalls[k++] = L[i++];
		}
		while (j < n2) {
			stalls[k++] = R[j++];
		}

	}
	
}
