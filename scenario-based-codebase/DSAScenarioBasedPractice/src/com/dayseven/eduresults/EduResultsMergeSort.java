package com.dayseven.eduresults;

public class EduResultsMergeSort {

	public static double[] merge(double marksBhopal[], double marksIndore[]) {

		int n1 = marksBhopal.length;
		int n2 = marksIndore.length;

		double merged[] = new double[n1 + n2];

		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {

			if (marksBhopal[i] < marksIndore[j]) {
				merged[k++] = marksBhopal[i++];
			} else {
				merged[k++] = marksIndore[j++];
			}
		}

		while (i < n1) {
			merged[k++] = marksBhopal[i++];
		}

		while (j < n2) {
			merged[k++] = marksIndore[j++];
		}

		return merged;

	}

	// display
	public static void display(double merge[]) {
		System.out.println("\n===== EduResults – Rank Sheet Generator =====");
		for (double value : merge) {
			System.out.print(value + " | ");
		}
	}

}
