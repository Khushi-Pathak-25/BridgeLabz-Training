import java.util.Scanner;

public class LongestWord {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return i;
    }

    // Method to find longest word
    public static String findLongestWord(String sentence) {
        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < findLength(sentence); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentWord = currentWord + ch;
            } else {
                if (findLength(currentWord) > findLength(longestWord)) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }

        // Check last word
        if (findLength(currentWord) > findLength(longestWord)) {
            longestWord = currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Longest word: " + findLongestWord(sentence));
		
		sc.close();
    }
}
