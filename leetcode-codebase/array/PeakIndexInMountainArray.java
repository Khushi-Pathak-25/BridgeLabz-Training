// https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1439305345
// Problem no. - 852

import java.util.*;

public class PeakIndexInMountainArray {

    // LeetCode method
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;      // you are in decreasing part
            } else {
                start = mid + 1; // you are in increasing part
            }
        }
        return start; // or end (both are same)
    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PeakIndexInMountainArray obj = new PeakIndexInMountainArray();
        int peakIndex = obj.peakIndexInMountainArray(arr);

        // Output
        System.out.println("Peak index is: " + peakIndex);

        sc.close();
    }
}
