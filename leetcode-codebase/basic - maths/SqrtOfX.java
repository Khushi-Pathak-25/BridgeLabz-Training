// https://leetcode.com/problems/sqrtx/submissions/1867899892
// Problem no - 69

import java.util.Scanner;

class SqrtOfX {

    // Method to find square root
    public int mySqrt(int x) {

        int ans = (int) Math.sqrt(x);
        return ans;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        // Create object
        SqrtOfX obj = new SqrtOfX();

        // Call method
        int result = obj.mySqrt(x);

        // Output
        System.out.println("Square root (integer part): " + result);

        sc.close();
    }
}
