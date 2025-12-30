/* 4. Metro Smart Card Fare Deduction 🚇
In Delhi Metro, fare varies by distance.
● Ask the user for distance.
● Calculate fare using ternary operator.
● Deduct from smart card balance.
Loop until balance is exhausted or the user quits.*/

import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
        // Initial smart card balance
        int balance = 100;   
        char choice;

        while (balance > 0) {

            System.out.println("Current Balance: Rs " + balance);
            System.out.print("Enter distance traveled (in km): ");
            int distance = input.nextInt();

            // fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 : 20;

            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare deducted: Rs " + fare);
            }
			else {
                System.out.println("Insufficient balance !");
                break;
            }

            System.out.print("Do you want to continue ? (y/n): ");
            choice = input.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                break;
            }

            System.out.println();
        }

        System.out.println("\nJourney ended.");
        System.out.println("Remaining Balance: Rs " + balance);

        input.close();
    }
}
