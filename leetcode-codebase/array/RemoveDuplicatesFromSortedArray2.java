// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/1866143078
// Problem number - 80

import java.util.Scanner;

class RemoveDuplicatesFromSortedArray2{

    // Method to remove duplicates (at most twice)
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int j = 2;   // pointer for placing elements

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements (sorted)
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        RemoveDuplicatesFromSortedArray2 obj = new RemoveDuplicatesFromSortedArray2();
        int k = obj.removeDuplicates(nums);

        // Output result
        System.out.println("Array after removing duplicates (max 2 allowed):");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
