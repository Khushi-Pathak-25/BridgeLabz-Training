import java.util.Scanner;

public class FibonacciSequence {

    // method to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {

        int first = 0, second = 1;
		
        // if number of terms is less than 0 
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
       
        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();
        
		// method calling
        printFibonacci(terms);

        input.close();
    }
}
