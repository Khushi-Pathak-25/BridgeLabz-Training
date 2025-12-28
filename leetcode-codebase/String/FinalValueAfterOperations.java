// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/1867881496
// Problem no - 2011

import java.util.Scanner;

class FinalValueAfterOperations {

    // Method to calculate final value
    public int finalValueAfterOperations(String[] operations) {

        int b = 0;

        for (int i = 0; i < operations.length; i++) {
            String c = operations[i];

            if (c.contains("+")) {
                b++;
            } else {
                b--;
            }
        }
        return b;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] operations = new String[n];

        // Input operations
        System.out.println("Enter operations (++, -- format):");
        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        // Create object
        FinalValueAfterOperations obj = new FinalValueAfterOperations();

        // Call method
        int result = obj.finalValueAfterOperations(operations);

        // Output
        System.out.println("Final value of variable: " + result);

        sc.close();
    }
}

