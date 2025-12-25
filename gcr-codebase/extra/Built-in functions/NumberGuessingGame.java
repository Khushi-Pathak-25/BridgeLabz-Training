import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

    // method to generate random number between low to high
    private static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
	// main method 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choose a number between 1 and 100. Let me try to guess it!");
        int low = 1;
        int high = 100;
        boolean correctGuess = false;

        while (!correctGuess) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'low' if your number is lower ,'high' it's higher, or 'correct' if I guessed right: ");
            String feedback = input.nextLine().toLowerCase();

            switch (feedback) {
                case "low":
                    high = guess - 1;
                    break;
                case "high":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("I guessed your number! It was " + guess);
                    correctGuess = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }

            if (low > high) {
                System.out.println("It seems there was a mistake. Let's try again.");
                break;
            }
        }
        input.close();
    }
}