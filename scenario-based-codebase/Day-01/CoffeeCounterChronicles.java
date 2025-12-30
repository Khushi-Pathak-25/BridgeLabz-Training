/* Problem 1: The Coffee Counter Chronicles

Ravi runs a café where customers order different types of coffee with specific quantities.
Write a Java program that asks the user for the coffee type using switch, accepts quantity,
calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, 
and continues serving customers using a while loop. The program should stop when the user types “exit”.*/


import java.util.*;

public class CoffeeCounterChronicles {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // GST percent on coffee purchase
        final double GST_RATE = 0.05; 
        
        // Ask for the order until the customer say exit
        while (true) {

            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino / Americano) or type 'exit' to stop:");
								 
            String coffeeType = input.nextLine().trim().toLowerCase();

            //Loop terminating condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you ! for visiting Cafe ");
                break;
            }

            double pricePerCup = 0;

            // Select coffee price using switch
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 100;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                case "americano":
                    pricePerCup = 120;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue; // Skip rest of loop and ask again
            }

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
   
            input.nextLine(); // clear buffer

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than zero.");
                continue;
            }

            // Bill calculation
            double baseAmount = (double)(pricePerCup * quantity);
            double gstAmount = baseAmount * GST_RATE;
            double totalBill = baseAmount + gstAmount;

            // Output
            System.out.println("\n----- Bill Details -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Amount : " + baseAmount);
            System.out.println("GST (5%)    : " + gstAmount);
            System.out.println("Total Bill  : " + totalBill);
            System.out.println("------------------------");
        }

        input.close();
	}
	
}