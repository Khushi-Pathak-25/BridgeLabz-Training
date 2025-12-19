import java.util.Scanner;

public class MultiplesBelowHundredUsingWhileLoop{

    public static void main(String[] args){

        // Creating Scanner class object
        Scanner input=new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        // Checking if number is positive and less than 100
        if (number<= 0 || number >=100){
            System.out.println("Please enter valid number ");
        } 
        else{
            System.out.println("Multiples of " + number + " below 100 are:");

            // Initializing counter
            int counter=100;

            // Run while loop till counter is greater than 1
            while (counter>1) {

                // Check if counter is a multiple of the number
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                // Decrementing counter
                counter--;
            } 
        }       

        input.close();
    }
}
