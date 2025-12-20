import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String args[]){
	
	    // Create Scanner class object
	    Scanner input = new Scanner(System.in);
		
		// Declare variables
        double first,second;
        String op;

        // Take input from user
        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        op = input.next();
		
		// Switch case for performing operations
		switch(op){
			
		    // Check for +,-,* and / operations
			
	        case "+":
                System.out.println("Result = "+(first + second));
                break;

            case "-":
                System.out.println("Result = "+(first - second));
                break;

            case "*":
                System.out.println("Result = "+(first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = "+(first / second));
                } 
				else {
				    System.out.println("Division by zero is not allowed");
				}
				break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
		
		