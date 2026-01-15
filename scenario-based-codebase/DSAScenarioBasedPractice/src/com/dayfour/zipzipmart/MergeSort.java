package com.dayfour.zipzipmart;

public class MergeSort {

	public static void mergeSort(Transaction[] transactions, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(transactions, left, mid);
			mergeSort(transactions, (mid + 1), right);

			merge(transactions, left, mid, right);
		}

	}

	private static void merge(Transaction transactions[], int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Transaction[] L = new Transaction[n1];
		Transaction[] R = new Transaction[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = transactions[left + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = transactions[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {

			if (L[i].date.compareTo(R[j].date) < 0
					|| (L[i].date.compareTo(R[j].date) == 0 && L[i].amount <= R[j].amount)) {

				transactions[k++] = L[i++]; // LEFT wins on equality
			} else {
				transactions[k++] = R[j++];
			}

		}
		while (i < n1) {

			transactions[k++] = L[i++];

		}

		while (j < n2) {
			transactions[k++] = R[j++];
		}
	}
}
