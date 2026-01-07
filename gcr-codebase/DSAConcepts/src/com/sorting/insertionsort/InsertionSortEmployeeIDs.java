package com.sorting.insertionsort;

import java.util.Arrays;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        int[] employeeIds1 = {112, 114, 111, 115, 113};
        int[] employeeIds2 = {104, 101, 105, 103, 102};

        System.out.println("Before Sorting:-");
        System.out.println(Arrays.toString(employeeIds1));

        InsertionSort.sort(employeeIds1);

        System.out.println("After Sorting (ascending):-");
        System.out.println(Arrays.toString(employeeIds1));

        System.out.println("\nBefore Sorting:-");
        System.out.println(Arrays.toString(employeeIds2));

        OptimizedInsertionSort.sort(employeeIds2);

        System.out.println("After Sorting (ascending):-");
        System.out.println(Arrays.toString(employeeIds2));
    }
}