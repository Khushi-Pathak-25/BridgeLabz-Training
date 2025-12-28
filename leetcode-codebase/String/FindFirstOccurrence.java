// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1867878113
// Problem no - 28

import java.util.Scanner;

class FindFirstOccurrence {

    // Method to find index of first occurrence
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the main string (haystack): ");
        String haystack = sc.nextLine();

        System.out.print("Enter the string to find (needle): ");
        String needle = sc.nextLine();

        // Create object
        FindFirstOccurrence obj = new FindFirstOccurrence();

        // Call method
        int index = obj.strStr(haystack, needle);

        // Output result
        if (index != -1) {
            System.out.println("First occurrence index: " + index);
        } else {
            System.out.println("String not found");
        }

        sc.close();
    }
}
