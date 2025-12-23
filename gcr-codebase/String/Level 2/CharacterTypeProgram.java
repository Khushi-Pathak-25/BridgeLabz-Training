import java.util.Scanner;

public class CharacterTypeProgram {

    // Method to check character type
    public static String checkCharacterType(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } 
			else {
                return "Consonant";
            }
        }

        // If not a letter
        return "Not a Letter";
    }

    // Method to create 2D array of characters and their types
    public static String[][] findCharacterTypes(String text) {

        int length = text.length();
        String[][] result = new String[length][2];

        // Traverse string using charAt()
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
			
            // use string functions
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {

        System.out.println("Character\tType");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Get 2D array result
        String[][] result = findCharacterTypes(text);

        // Display result
        displayTable(result);

        input.close();
    }
}
