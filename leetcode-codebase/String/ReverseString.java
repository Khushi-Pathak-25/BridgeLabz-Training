// https://leetcode.com/problems/reverse-string/submissions/1867873728
// Problem no-344

import java.util.Scanner;

class ReverseString {

    // Method to reverse character array
    public void reverseString(char[] s) {

        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert String to char array
        char[] arr = input.toCharArray();

        // Create object
        ReverseString obj = new ReverseString();

        // Call method
        obj.reverseString(arr);

        // Print reversed string
        System.out.print("Reversed string: ");
        for (char ch : arr) {
            System.out.print(ch);
        }

        sc.close();
    }
}
