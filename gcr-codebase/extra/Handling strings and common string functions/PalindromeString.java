import java.util.Scanner;

public class PalindromeString {

    // method to check palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
	    // create Scanner class object
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = obj.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome");
        } 
		else {
            System.out.println("The string is not a Palindrome");
        }
		obj.close();
    }
}
