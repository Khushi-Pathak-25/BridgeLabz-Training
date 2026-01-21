package com.dayeight.gamerzone;

public class GamerZoneQuickSort {

	public static void quickSort(Player player[], int low, int high) {

		if (low < high) {

			int pivotIndex = partition(player, low, high);

			quickSort(player, low, pivotIndex - 1);
			quickSort(player, pivotIndex + 1, high);

		}

	}

	public static int partition(Player player[], int low, int high) {

		int pivot = player[high].score;

		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (player[j].score > pivot) {
				i++;
				Player temp = player[i];
				player[i] = player[j];
				player[j] = temp;
			}
		}

		i++;
		Player temp = player[i];
		player[i] = player[high];
		player[high] = temp;

		return i;
	}

}
