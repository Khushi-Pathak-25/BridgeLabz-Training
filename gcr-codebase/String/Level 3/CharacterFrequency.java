import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequency and return 2D array
    public static String[][] findFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        //1. Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //2. Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }

        //3. Create 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Reset frequency array for reuse
        for (int i = 0; i < 256; i++) {
            if (freq[i] < 0)
                freq[i] = -freq[i];
        }

        // 4. Store characters and frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // avoid duplicate entry
                index++;
            }
        }

        return result;
    }

    // Method to display result
    public static void display(String[][] result) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);

        display(frequency);

        sc.close();
    }
}
