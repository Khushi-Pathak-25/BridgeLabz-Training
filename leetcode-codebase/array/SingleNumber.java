// https://leetcode.com/problems/single-number/submissions/1869692102

import java.util.Scanner;

public class SingleNumber {

    // Method to find the single number
    public static int singleNumber(int[] nums) {
        int output = 0;

        for (int num : nums) {
            // XOR operation: same numbers cancel each other
            output ^= num;
        }
        return output;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNumber(nums);

        System.out.println("Single number is: " + result);

        sc.close();
    }
}
