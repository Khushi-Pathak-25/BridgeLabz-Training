import java.util.Scanner;

public class VowelConsonantCountProgram {

    // method to check whether a character is vowel, consonant or not a letter
    public static String checkCharacter(char ch) {

        // Convert uppercase letter to lowercase using ASCII value
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        // If character is not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    // Returns count in an array → index 0 = vowels, index 1 = consonants
    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        // Traverse each character using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } 
			else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Store counts in array
        int[] counts = new int[2];
        counts[0] = vowelCount;
        counts[1] = consonantCount;

        return counts;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method to get counts
        int[] result = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        input.close();
    }
}
