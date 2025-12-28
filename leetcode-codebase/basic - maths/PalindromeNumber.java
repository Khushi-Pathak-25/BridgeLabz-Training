// https://leetcode.com/problems/palindrome-number/submissions/1867892061
// Problem no.- 9

import java.util.Scanner;

class PalindromeNumber {

    // Method to check palindrome number
    public boolean isPalindrome(int x) {

        int temp = x;
        int rem = 0;

        while (temp > 0) {
            rem = rem * 10 + temp % 10;
            temp /= 10;
        }

        if (rem == x) {
            return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        // Create object
        PalindromeNumber obj = new PalindromeNumber();

        // Call method
        boolean result = obj.isPalindrome(x);

        // Output
        if (result) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is NOT a Palindrome");
        }

        sc.close();
    }
}
