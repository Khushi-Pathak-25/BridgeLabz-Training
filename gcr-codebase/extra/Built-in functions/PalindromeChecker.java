import java.util.Scanner;

public class PalindromeChecker {

    // method to take input string
    public static String takeInput(Scanner input) {
        return input.nextLine();
    }

    // method to check if string is palindrome
    public static boolean isPalindrome(String str){
        
        int start = 0;
        int end = str.length()-1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // method to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a Palindrome.");
        }
		else {
            System.out.println("\"" + str + "\" is Not a Palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = takeInput(sc);

        boolean result = isPalindrome(input);

        displayResult(input, result);

        sc.close();
    }
}
