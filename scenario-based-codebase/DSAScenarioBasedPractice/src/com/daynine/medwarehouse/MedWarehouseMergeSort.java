package com.daynine.medwarehouse;

import java.util.ArrayList;
import java.util.List;

public class MedWarehouseMergeSort {

	public static List<Medicine> mergeSort(List<Medicine> list) {

		if (list.size() <= 1) {
			return list;
		}

		int mid = list.size() / 2;

		List<Medicine> left = mergeSort(list.subList(0, mid));
		List<Medicine> right = mergeSort(list.subList(mid, list.size()));

		return merge(left, right);
	}

	private static List<Medicine> merge(List<Medicine> left, List<Medicine> right) {

		List<Medicine> result = new ArrayList<>();

		int i = 0, j = 0;
		while (i < left.size() && j < right.size()) {

			if (left.get(i).expiryDate.isBefore(right.get(j).expiryDate)) {

				result.add(left.get(i++));
			} else {
				result.add(right.get(j++));
			}
		}

		while (i < left.size()) {
			result.add(left.get(i++));
		}
		while (j < right.size()) {
			result.add(right.get(j++));
		}

		return result;

	}
}
