// https://leetcode.com/problems/two-sum/submissions/1865669545
// Problem number - 1

import java.util.Scanner;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TwoSum obj = new TwoSum();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int[] result = obj.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No two sum solution found");
        }
    }
}
