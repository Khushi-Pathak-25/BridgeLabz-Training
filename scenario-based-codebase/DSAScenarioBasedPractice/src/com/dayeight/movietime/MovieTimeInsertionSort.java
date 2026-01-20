package com.dayeight.movietime;

import java.util.List;
import java.util.ArrayList;

public class MovieTimeInsertionSort {

	public static void insertionSort(int showTime[]) {

		int n = showTime.length;

		for (int i = 1; i < n; i++) {

			int current = showTime[i];
			int j = i - 1;

			while (j >= 0 && current < showTime[j]) {

				showTime[j + 1] = showTime[j];
				j--;
			}
			showTime[j + 1] = current;
		}

	}

	public static void display(int showTime[]) {

		System.out.println("-------- Show time in 24-hours format (in ascending order) ----------");

		System.out.println( " |   Shows Time   | ");
		for (int show : showTime) {
			System.out.println( " |       "+ show + "       | ");
		}

	}

}
