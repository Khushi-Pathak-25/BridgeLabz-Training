import java.util.Scanner;

public class NumberCheck {

    // Create static method  to check number type
    static int checkNumber(int number) {
        if (number > 0){
            return 1;
		}
        else if (number < 0){
            return -1;
		}	
        else {
            return 0;
		}	
    }

    public static void main(String[] args) {
        
		// Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
        // Calling method
        int result = checkNumber(number);
        
		// Display output
        System.out.println("Result = " + result);
    }
}
