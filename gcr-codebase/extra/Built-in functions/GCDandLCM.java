import java.util.Scanner;

public class GCDandLCM {

    // method to take input
    public static int[] takeInput() {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[2];

        System.out.print("Enter first number: ");
        nums[0] = input.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = input.nextInt();

        return nums;
    }

    // method to calculate GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
		    // Base condition
            return a;  
        }
		// Recursive call
        return findGCD(b, a % b);  
    }

    // method to calculate LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // method to display output
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    // main method
    public static void main(String[] args) {
        int[] numbers = takeInput();      // Input
        int gcd = findGCD(numbers[0], numbers[1]);  // GCD
        int lcm = findLCM(numbers[0], numbers[1]);  // LCM
        displayResult(numbers[0], numbers[1], gcd, lcm); // Output
    }
}
