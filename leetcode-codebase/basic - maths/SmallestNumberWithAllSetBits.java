// https://leetcode.com/problems/smallest-number-with-all-set-bits/submissions/1867903316
// Problem no - 3370

import java.util.Scanner;

class SmallestNumberWithAllSetBits {

    // Method to find smallest number with all set bits
    public int smallestNumber(int n) {

        int result = 1;

        while (result < n) {
            result = 2 * result + 1;
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object
        SmallestNumberWithAllSetBits obj = new SmallestNumberWithAllSetBits();

        // Call method
        int ans = obj.smallestNumber(n);

        // Output
        System.out.println("Smallest number with all set bits : " + ans);

        sc.close();
    }
}
