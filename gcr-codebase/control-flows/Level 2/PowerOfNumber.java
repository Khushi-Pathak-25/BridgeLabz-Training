import java.util.Scanner;

public class PowerOfNumber{

    public static void main(String[] args){

        // Creating Scanner class object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number: ");
        int number=input.nextInt();

        System.out.print("Enter the power: ");
        int power=input.nextInt();

        //Checking for positive integers
        if (number<=0 || power <0) {
            System.out.println("Please enter positive integers only.");
        } 
        else {

            // Initializing result variable
            int result=1;

            // Taking for loop to calculate power
            for (int i=1; i<=power; i++) {
                result=result * number;
            }

            // Printing the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}
