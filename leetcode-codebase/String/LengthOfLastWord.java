// https://leetcode.com/problems/length-of-last-word/submissions/1867885378
// Problem no- 58

import java.util.Scanner;

class LengthOfLastWord {

    // Method to find length of last word
    public int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        LengthOfLastWord obj = new LengthOfLastWord();

        // Call method
        int result = obj.lengthOfLastWord(input);

        // Output
        System.out.println("Length of last word: " + result);

        sc.close();
    }
}

