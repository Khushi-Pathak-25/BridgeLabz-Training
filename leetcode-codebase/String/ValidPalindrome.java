// https://leetcode.com/problems/valid-palindrome/submissions/1867866382
// Problem no - 125

import java.util.Scanner;

class ValidPalindrome {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        ValidPalindrome obj = new ValidPalindrome();
        boolean result = obj.isPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome");
        } 
		else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}
