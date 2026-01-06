package com.hashmaps.pairwithgivensum;

import java.util.HashMap;

public class PairWithGivenSum {

    // Checks if any pair adds up to target sum
    public static boolean hasPair(int[] arr, int target) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        // Traverse array once
        for (int i = 0; i < arr.length; i++) {

            int required = target - arr[i];

            // If required value already seen, pair exists
            if (map.containsKey(required)) {
                System.out.println("Pair found: " + arr[i] + " + " + required);
                return true;
            }

            // Store current element
            map.put(arr[i], true);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 2, 5, 3, 1};
        int target = 10;

        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }
    }
}