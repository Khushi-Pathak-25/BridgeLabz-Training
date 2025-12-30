/* 10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge. */

import java.util.Scanner;

public class PhoneRechargeSimulator{

    public static void main(String [] args){
	
	    Scanner input = new Scanner(System.in);
        double balance = 0;
		char choice;
		
		do{
		// Take amount from user
		System.out.println("Enter amount for recharge rs. ");
		double amount = input.nextInt();
		balance+= amount;
		
		// mobile operator
		System.out.println("Enter 1 for Jio");
		System.out.println("Enter 2 for Airtel");
		System.out.println("Enter 3 for VI");
		System.out.println("Enter operator");
		int userChoice = input.nextInt();
		
		// switch case
		switch (userChoice){
		
		case 1:
		    System.out.println("Jio Offer: 1.5GB/day + Unlimited Calls");
            break;
		
		case 2:
		    System.out.println("Airtel Offer: 1.5GB/day + Unlimited Calls");
			break;
			
		case 3:
            System.out.println("VI Offer: 1.5GB/day + Unlimited Calls");
            break;
        
        default:
            System.out.println("Invalid operator plan");			
		}
	    
	    // Show balance
        System.out.println("Current Balance: Rs " + balance);

        // Repeat
        System.out.print("Do you want to recharge again? (y/n): ");
        choice = input.next().charAt(0);

        } 
		while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Phone Recharge Simulator");	
		
		input.close();
    }
}