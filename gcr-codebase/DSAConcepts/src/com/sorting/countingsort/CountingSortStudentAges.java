package com.sorting.countingsort;

import java.util.Arrays;

public class CountingSortStudentAges {

    public static void main(String[] args) {

        int[] studentAges = {16, 13, 17, 11, 14, 15, 10, 18};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(studentAges));

        CountingSort.sort(studentAges);

        System.out.println("After Sorting (Ascending):");
        System.out.println(Arrays.toString(studentAges));
    }
}