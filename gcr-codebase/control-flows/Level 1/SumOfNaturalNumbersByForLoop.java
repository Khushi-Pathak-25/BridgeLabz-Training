import java.util.Scanner;

public class SumOfNaturalNumbersByForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number ");
        } 
        else {
            // Sum using for loop
            int sumFor = 0;
            for(int i = 1 ; i<=number ; i++ ){
                sumFor+=i;
            }

            // Sum using formula
            int sumFormula = number * (number + 1) / 2;

            // Print both results
            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula = " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations are not matching.");
            }
         }
        input.close();
       
    }
}
