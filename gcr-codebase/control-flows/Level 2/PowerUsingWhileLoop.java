import java.util.Scanner;

public class PowerUsingWhileLoop{

    public static void main(String[] args){

        // Creating Scanner class object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number: ");
        int number=input.nextInt();

        System.out.print("Enter the power: ");
        int power=input.nextInt();

        //Checking for positive integers
        if (number<=0 || power <0){
            System.out.println("Please enter positive integers only.");
        } 
        else{

            // Initializing result variable
            int result=1;

            // Initializing counter
            int counter=1;

            // Run while loop till counter equals power
            while (counter<=power){

                // Multiplying result by number
                result=result * number;

                // Incrementing counter
                counter++;
            }

            // Printing the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}
