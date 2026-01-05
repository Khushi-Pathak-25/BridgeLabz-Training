// https://leetcode.com/problems/detect-capital/submissions/1875706377
// Probelm no.-520

import java.util.Scanner;

public class DetectCapital {

    // Checks if capital usage is correct
    public boolean detectCapitalUse(String word) {
        int capitals = 0;

        // Count uppercase letters
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitals++;
            }
        }

        return capitals == word.length()
                || capitals == 0
                || (capitals == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DetectCapital sol = new DetectCapital();

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println(sol.detectCapitalUse(word));

        input.close();
    }
}