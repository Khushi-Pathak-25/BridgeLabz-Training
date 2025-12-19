import java.util.Scanner;

public class GreatestFactorUsingWhile{

    public static void main(String[] args){

        // Creating Scanner Class object
        Scanner input=new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        // Checking for input
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } 
        else {

            // Initializing greatestFactor to 1
            int greatestFactor=1;

            // Initializing counter
            int counter=number-1;

            // Run while loop-->counter reaches 1
            while (counter>=1) {

                // Check if number is divisible by counter
                if (number % counter==0) {
                    greatestFactor=counter;
                    break; 
                }
                // Decrement counter
                counter--;
            }

            // Displaying the result
            System.out.println("Greatest factor of " + number + " beside itself is: " + greatestFactor);
        }

        input.close();
    }
}
