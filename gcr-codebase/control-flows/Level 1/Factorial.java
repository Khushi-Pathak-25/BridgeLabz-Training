import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from users
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else {
            int factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            // Print result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
