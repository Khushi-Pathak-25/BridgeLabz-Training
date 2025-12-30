// https://leetcode.com/problems/search-insert-position/submissions/1869734661

import java.util.Scanner;

public class InsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        // check for last index
        if (nums[length - 1] == target) {
            return length - 1;
        } else if (nums[length - 1] < target) {
            return length;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = searchInsert(nums, target);
        System.out.println("Insert Position Index: " + result);

        sc.close();
    }
}
