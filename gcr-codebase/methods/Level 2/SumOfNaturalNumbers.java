import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Create method to find sum by recursion
    public static int recursiveSum(int n) {
        if (n==0){
            return 0;
		}	
        return n + recursiveSum(n - 1);
    }

    // Create method to find sum using formula
    public static int formulaSum(int n) {
        return n*(n + 1)/2;
    }
    
    public static void main(String[] args) {
	
        // Create Scanner class object
        Scanner input = new Scanner(System.in);
        
		// Take input of number by user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number<=0) {
            System.out.println("Enter a natural number");
        } 
		else {
		
		    // Calling methods and store result in variables
            int sumByRecursion = recursiveSum(number);
            int sumByFormula = formulaSum(number);
            
			// Disply results
            System.out.println("Sum using recursion = " + sumByRecursion);
            System.out.println("Sum using formula = " + sumByFormula);

            // Compare both results
            if (sumByRecursion == sumByFormula) {
                System.out.println("Both results are equal and correct");
            } 
			else {
                System.out.println("Results are not equal");
            }
        }

        input.close();
    }
}
