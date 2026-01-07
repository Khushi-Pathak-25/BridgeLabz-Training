package com.sorting.mergesort;

import java.util.Arrays;

public class MergeSortBookPrices {

    public static void main(String[] args) {

        int[] bookPrices = {500, 220, 600, 400, 540, 170};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bookPrices));

        MergeSort.sort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("After Sorting (Ascending):");
        System.out.println(Arrays.toString(bookPrices));
    }
}