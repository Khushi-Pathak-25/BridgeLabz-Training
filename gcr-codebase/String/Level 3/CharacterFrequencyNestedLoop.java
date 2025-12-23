import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        // Step 1: Calculate frequency using nested loops
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {
                continue;
            }

            freq[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Step 2: Count valid characters
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Step 3: Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}

