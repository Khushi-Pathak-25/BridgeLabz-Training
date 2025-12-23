import java.util.Scanner;

public class UpperCaseCompareProgram {

    // method to convert text to uppercase using charAt()
    public static String convertToUpperCase(String text) {
        String result = "";

        // traverse each character of the string
        for (int i = 0; i < text.length(); i++) {
		    // store 0 index value
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase using ASCII logic
                ch = (char) (ch - 32);
            }

            // Append character to result string
            result = result + ch;
        }
        return result;
    }

    // method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        // If lengths are not equal,it means strings are not same
        if (s1.length() != s2.length()) {
            return false;
        }
		// If length is equal
        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
	
    //  main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take complete text input from user
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Convert text to uppercase using user-defined method
        String userUpper = convertToUpperCase(text);

        // Convert text to uppercase using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare both results using user-defined compare method
        boolean result = compareStrings(userUpper, builtInUpper);

        // Display results
        System.out.println("User-defined Uppercase: " + userUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
