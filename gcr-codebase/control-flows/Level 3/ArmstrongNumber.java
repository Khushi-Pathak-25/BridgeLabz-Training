import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        // Creating variable originalNumber and assigning value number
        int originalNumber = number;

        // Creating sum variable and initializing to 0

        int totalsum = 0;  

	// For power calculatin
        int count = 0;

        while(number != 0) {
            count++;
            number /= 10;
        }

        number = originalNumber; 

        // Checking digit by remainder
        while (number != 0) {
            // Unit digit
            int digit = number % 10;

            // Sum of digits with respect to power 
            totalsum += Math.pow(digit, count); 
            // Reducing number 
            number /= 10;  
        }

        // Displaying result

        if (totalsum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } 
        else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close(); 
    }
}