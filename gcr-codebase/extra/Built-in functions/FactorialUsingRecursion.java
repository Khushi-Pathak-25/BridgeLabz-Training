import java.util.Scanner;

public class FactorialUsingRecursion {

    // method to take input
    public static int takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // recursive method to calculate factorial
    public static long factorial(int num) {
	    // Base condition
        if (num == 0 || num == 1) {
            return 1;   
        }
		 // Recursive call
        return num * factorial(num  - 1); 
    }

    // method to display output
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // main method
    public static void main(String[] args) {
        int number = takeInput();          // Input
        long result = factorial(number);   // Calculation
        displayResult(number, result);     // Output
    }
}
