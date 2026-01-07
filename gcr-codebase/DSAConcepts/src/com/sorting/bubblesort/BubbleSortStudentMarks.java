package com.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSortStudentMarks {

    public static void main(String[] args) {

        int[] studentMarks1 = {36, 76, 89, 92, 43, 95};

        System.out.println("Marks before sorting:");
        System.out.println(Arrays.toString(studentMarks1));

        BubbleSort.sort(studentMarks1);

        System.out.println("Marks after sorting (Ascending):");
        System.out.println(Arrays.toString(studentMarks1));
        
        
        int[] studentMarks2 = {44, 34, 68, 83, 89, 97};

        System.out.println("Marks before sorting:");
        System.out.println(Arrays.toString(studentMarks2));
        

        OptimizedBubbleSort.sort(studentMarks2);

        System.out.println("Marks after sorting (Ascending):");
        System.out.println(Arrays.toString(studentMarks2));
    }
}