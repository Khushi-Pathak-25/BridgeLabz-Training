/*20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int visitors;
		System.out.println("\n================================");
		System.out.println(" Welcome to Festival Lucky Draw ");
	    System.out.println("=================================");

        System.out.print("Enter number of visitors: ");
        visitors = input.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.println("\nVisitor " + i);
            System.out.print("Enter lucky draw number: ");
            int number = input.nextInt();

            // Invalid input check
            if (number <= 0) {
                System.out.println("Invalid number! Try again...");
                continue;
            }

            // Lucky draw condition
            if (number % 3 == 0 && number % 5 == 0) {
			    System.out.println("----------------------------------");
                System.out.println(" Congratulations! You won a gift ");
            } 
			else {
                System.out.println("Sorry! Better luck next time.");
            }
        }

        input.close();
    }
}
