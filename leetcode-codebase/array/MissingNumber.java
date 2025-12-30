// https://leetcode.com/problems/missing-number/submissions/1869742854

import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        // XOR all elements present in array
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = missingNumber(nums);
        System.out.println("Missing Number is: " + result);

        sc.close();
    }
}
