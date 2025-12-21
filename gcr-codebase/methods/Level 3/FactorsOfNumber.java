import java.util.Scanner;

public class FactorsOfNumber{

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int number) {

        // first loop counts factors
        int count = 0;
        for (int i = 1 ; i <= number ; i++) {
            if (number % i==0) {
                count++;
            }
        }

        // Create array 
        int[] factors = new int[count];

        // Second loop stores factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
		
        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {

        int maximumFactor = factors[0];
        for (int f : factors) {
            if (f > maximumFactor) {
                maximumFactor = f;
            }
        }
        return maximumFactor;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {

        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double findProductOfCubes(int[] factors) {

        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.print("\nFactors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nGreatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubes(factors));

        input.close();
    }
}
