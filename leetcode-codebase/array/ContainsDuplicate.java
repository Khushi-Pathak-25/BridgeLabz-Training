// https://leetcode.com/problems/contains-duplicate/submissions/1869717060

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    // Method to check duplicates
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // if element already exists
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
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

        boolean result = containsDuplicate(nums);

        if (result) {
            System.out.println("Duplicate found");
        } else {
            System.out.println("All elements are distinct");
        }

        sc.close();
    }
}
