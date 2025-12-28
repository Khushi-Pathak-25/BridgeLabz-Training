// https://leetcode.com/problems/plus-one/submissions/1867907748
// Problem no. - 66

import java.util.Scanner;
import java.util.Arrays;

class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Add 1 and return
                return digits;
            }
            digits[i] = 0;  // Set to 0 if 9
        }

        // If all digits were 9, create new array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;  // First digit is 1, rest are 0 by default
        return newNumber;
    }

    // Main method for user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        // Input digits
        System.out.println("Enter the digits (space-separated):");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Create object and call method
        PlusOne obj = new PlusOne();
        int[] result = obj.plusOne(digits);

        // Output the result
        System.out.println("Resulting array after plus one: " + Arrays.toString(result));

        sc.close();
    }
}


