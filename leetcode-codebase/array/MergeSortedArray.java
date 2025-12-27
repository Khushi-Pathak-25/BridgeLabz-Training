// https://leetcode.com/problems/merge-sorted-array/submissions/1866150353
// Problem no.- 88

import java.util.Scanner;

public class MergeSortedArray {

    // Merge function
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input m and n
        System.out.print("Enter number of elements in first array (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of elements in second array (n): ");
        int n = sc.nextInt();

        // nums1 size = m + n
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        // Input nums1 elements
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input nums2 elements
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Merge arrays
        merge(nums1, m, nums2, n);

        // Output merged array
        System.out.println("Merged Sorted Array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}
