// https://leetcode.com/problems/guess-number-higher-or-lower/submissions/1875686837
// problem no - 374

import java.util.Scanner;

public class GuessNumberHigherOrLower {

    // This variable simulates the picked number
    static int pick;

    // Simulated guess API
    public static int guess(int num) {
        if (num > pick) {
            return -1; // guessed number is higher
        } else if (num < pick) {
            return 1;  // guessed number is lower
        } else {
            return 0;  // correct guess
        }
    }

    // Method to find the picked number
    public static int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // never reached as pick is guaranteed to exist
    }

    // Main method with user-defined input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter picked number: ");
        pick = sc.nextInt();

        int answer = guessNumber(n);
        System.out.println("Picked Number is: " + answer);

        sc.close();
    }
}
