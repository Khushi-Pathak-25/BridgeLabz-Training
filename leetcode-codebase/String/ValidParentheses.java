// https://leetcode.com/problems/valid-parentheses/submissions/1869696320

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    // Method to check valid parentheses
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        boolean result = isValid(s);

        if (result) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }

        sc.close();
    }
}
