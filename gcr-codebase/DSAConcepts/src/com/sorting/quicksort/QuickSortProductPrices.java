package com.sorting.quicksort;

import java.util.Arrays;

public class QuickSortProductPrices {

    public static void main(String[] args) {

        int[] productPrices = {600, 1450, 800, 300, 1500, 200};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(productPrices));

        QuickSort.sort(productPrices, 0, productPrices.length - 1);

        System.out.println("After Sorting (Ascending):");
        System.out.println(Arrays.toString(productPrices));
    }
}