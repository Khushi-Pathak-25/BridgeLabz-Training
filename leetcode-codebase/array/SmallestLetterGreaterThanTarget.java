// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1866163590
// Problem no. -

import java.util.*;

public class SmallestLetterGreaterThanTarget {

    // LeetCode method
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // wrap-around case
        return letters[start % letters.length];
    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of letters array: ");
        int n = sc.nextInt();

        char[] letters = new char[n];

        // Input letters
        System.out.println("Enter characters (sorted):");
        for (int i = 0; i < n; i++) {
            letters[i] = sc.next().charAt(0);
        }

        // Input target
        System.out.print("Enter target character: ");
        char target = sc.next().charAt(0);

        SmallestLetterGreaterThanTarget obj =
                new SmallestLetterGreaterThanTarget();

        char result = obj.nextGreatestLetter(letters, target);

        // Output
        System.out.println("Next greatest letter is: " + result);

        sc.close();
    }
}
