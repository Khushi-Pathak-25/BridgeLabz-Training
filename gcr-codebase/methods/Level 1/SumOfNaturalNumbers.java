import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Create method to calculate sum using loop
    static int findSum(int number) {
        int sum = 0;
		// Calculating sum of natural number
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
	
        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of number : ");
        int number = input.nextInt();
        
		// Calling findSum method 
        int result = findSum(number);
        
		// Display output
        System.out.println("Sum of first " + number + " natural numbers = " + result);
		
		input.close();
    }
}
