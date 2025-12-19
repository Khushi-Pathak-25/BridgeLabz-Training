import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args){

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input 
        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        // If number is less than or equal to 1 is not  prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        }
        // If number is prime
        else {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {

                // Check if number is divisible by any other number
                if (number % i == 0) {
                    isPrime = false; 
                    // terminate loop 
                    break;
               }
            }

            // Output is-
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } 
            else {
                System.out.println(number + " is not a prime number.");
            }
        }

        input.close();
    }
}