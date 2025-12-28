// https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/submissions/1867896512
// Problem no- 3622

import java.util.Scanner;

class CheckDivisibility {

    // Method to check divisibility
    public boolean checkDivisibility(int n) {

        int num = n;
        int sum = 0, product = 1;

        while (num > 0) {
            int temp = num % 10;
            sum += temp;
            product *= temp;
            num /= 10;
        }

        return n % (sum + product) == 0;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object
        CheckDivisibility obj = new CheckDivisibility();

        // Call method
        boolean result = obj.checkDivisibility(n);
        
		// Output
        if (result) {
            System.out.println("Number is divisible by (sum + product of digits)");
        } 
		else {
            System.out.println("Number is NOT divisible by (sum + product of digits)");
        }

        sc.close();
    }
}
