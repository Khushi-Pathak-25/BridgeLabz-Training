/* 18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String args[]){
	
	    Scanner input = new Scanner(System.in);
		char userChoice;
		double calculateAmount;
		
        System.out.println("=================================");
        System.out.println("      Currency Exchange Kiosk     ");
        System.out.println("=================================");
		
		do{
		
		    // take inputs from user
		    System.out.print("Enter amount in INR :");
			double amount = input.nextDouble();
			
			System.out.print("Choose target currency unit :\nA. EUR \nB. Yen \nC. USD \nD. GBP \n");
		    
			System.out.print("Enter your option: (A/B/C/D)\n");
			// enter user input 
			char option = input.next().toUpperCase().charAt(0);
			
			switch (option){
			
			    case 'A' :		  
				    calculateAmount = (amount /90); // EUR
					System.out.println(amount + " INR = " + calculateAmount + " EUR");
					break;
				
				case 'B' :
				    // 1 Indian Rupee = 1.739 Japanese Yen
				    calculateAmount = amount * 1.739;
					System.out.println(amount + " INR = " + calculateAmount + " Yen");
					break;
					
				case 'C' :
				    calculateAmount = (amount / 83) ; // USD
					System.out.println(amount + " INR = " + calculateAmount + " USD");
					break;
					
				case 'D' :
					calculateAmount = amount * 0.008;
					System.out.println(amount + " INR = " + calculateAmount + " GBP");
					break;

			   
			    default :
				    System.out.println("Invalid option ! Please enter right option");
				
			}
			
			System.out.println("------------------------------------------------");
			System.out.println("Do you want to convert more currency ?('Y'/'N')");	
			
			userChoice = input.next().toUpperCase().charAt(0);
			
	        while (userChoice != 'Y' && userChoice != 'N') {
                System.out.println("Please enter valid option !");
                System.out.print("Enter (Y/N): ");
				userChoice = input.next().toUpperCase().charAt(0);
			}

        }			
			
			while(userChoice != 'N');
			
			System.out.println("=======================================");
			System.out.println("Thankyou for using currency converter !");
			
			input.close();	
	
	}
}