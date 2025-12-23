import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } 
				else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        input.close();
    }
}
