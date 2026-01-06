package com.hashmaps.zerosumsubarrays;

import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSumSubarrays {

    // Finds and prints all subarrays with sum 0
    public static void findZeroSumSubarrays(int[] arr) {

        // Map to store cumulative sum and its indices
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int sum = 0;

        // Sum 0 at index -1 to handle subarrays starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If sum already exists, zero-sum subarrays found
            if (map.containsKey(sum)) {

                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            // Store current index for this sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, -4, -2, -2};

        findZeroSumSubarrays(arr);
    }
}