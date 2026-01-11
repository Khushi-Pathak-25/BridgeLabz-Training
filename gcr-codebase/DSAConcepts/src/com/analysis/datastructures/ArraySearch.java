package com.analysis.datastructures;

public class ArraySearch {

    public static boolean search(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
