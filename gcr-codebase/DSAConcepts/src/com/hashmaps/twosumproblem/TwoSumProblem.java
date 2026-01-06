package com.hashmaps.twosumproblem;

import java.util.HashMap;

public class TwoSumProblem {

	// Returns indices of two numbers that add up to target
	public static int[] twoSum(int[] arr, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		// Traverse array
		for (int i = 0; i < arr.length; i++) {

			int required = target - arr[i];

			// Check if complement exists
			if (map.containsKey(required)) {
				return new int[] { map.get(required), i };
			}

			// Store current value with index
			map.put(arr[i], i);
		}

		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum(arr, target);

		if (result[0] != -1) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No pair found");
		}
	}
}
