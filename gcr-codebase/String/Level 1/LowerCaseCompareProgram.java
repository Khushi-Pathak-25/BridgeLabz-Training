import java.util.Scanner;

public class LowerCaseCompareProgram{

    // method to convert text to uppercase using charAt()
    public static String convertToLowerCase(String text) {
        String result = "";

        // traverse each character of the string by loop
        for (int i = 0; i < text.length(); i++) {
		    // store 0 index value
            char ch = text.charAt(i);
			
            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase using ASCII logic
                ch = (char) (ch + 32);
            }
            // Append character to result string
            result = result + ch;
        }
		// return resulted string
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
        String userLower = convertToLowerCase(text);

        // Convert text to uppercase using built-in method
        String builtInLower = text.toLowerCase();

        // Compare both results using user-defined compare method
        boolean result = compareStrings(userLower, builtInLower);

        // Display results
        System.out.println("User-defined Lowercase: " + userLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
