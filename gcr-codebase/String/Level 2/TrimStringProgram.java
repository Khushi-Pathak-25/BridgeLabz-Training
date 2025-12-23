import java.util.Scanner;

public class TrimStringProgram {

    // method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        // creating array to store start and end
        int[] indexes = new int[2];
        indexes[0] = start;
        indexes[1] = end;

        return indexes;
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with spaces: ");
        String text = input.nextLine();

        // Find trim indexes using user-defined method
        int[] indexes = findTrimIndexes(text);

        // Create trimmed string using charAt()
        String userTrimmed = createSubstring(text, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrimmed = text.trim();

        // Compare both results
        boolean result = compareStrings(userTrimmed, builtInTrimmed);

        // Display results
        System.out.println("User-defined trimmed text: [" + userTrimmed + "]");
        System.out.println("Built-in trimmed text:     [" + builtInTrimmed + "]");
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
