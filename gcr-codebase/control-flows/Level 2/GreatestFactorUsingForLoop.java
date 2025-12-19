import java.util.Scanner;

public class GreatestFactorUsingForLoop{

    public static void main(String[] args){

        // Create Scanner object
        Scanner input=new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        // Check for positive integer
        if(number <= 1){
            System.out.println("Please enter an integer greater than 1.");
        } 
        else{

            // Initialize greatestFactor to 1
            int greatestFactor=1;

            // Loop from number-1 to 1
            for(int i=number-1; i >= 1; i--) {

                // Check if number is divisible by i
                if(number % i == 0) {
                    greatestFactor = i;
                    break; // Exit loop after finding the greatest factor
                }
            }

            // Print the result
            System.out.println(
                "Greatest factor of " + number + " beside itself is: " + greatestFactor);
        }

        input.close();
    }
}
