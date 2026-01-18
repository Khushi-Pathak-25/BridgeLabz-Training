/*25. "PayXpress – Utility Bill Payment System"
Story: PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and
reminders.
Requirements:
● Bill class: type, amount, dueDate, isPaid.
● Interface IPayable with pay() and sendReminder().
● Use constructors to create recurring bills.
● Operators for calculating late fees: baseAmount + penalty.
● Encapsulation: prevent direct payment status changes.
● Inheritance: ElectricityBill, InternetBill, WaterBill.
● Polymorphism: reminders vary depending on utility type.
● Access Modifiers: payment details are internal only.*/

package com.daynine.payxpress;

import java.util.Scanner;
public class MainPayXpress {
	
	public static void main(String []args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    Bill bill = null;
	    
	    System.out.println("===== Welcome to PayXpress =====");
	    
	    System.out.println("1. Electricity Bill\n2. Water Bill\n3. Internet Bill");
	    System.out.print("Choose Bill Type: ");
	    int choice = input.nextInt();
	    
	    System.out.print("Enter bill amount(in Rs.): ");
	    double amount = input.nextDouble();
	    
	    input.nextLine(); // clear buffer
	    
	    System.out.print("Enter due date: ");
	    String dueDate = input.nextLine();
	    
	    // creating object based on user choice (Polymorphism)
	    switch(choice) {
	        case 1:
	        	bill = new ElectricityBill(amount, dueDate);
	            break;
	            
	        case 2:
	        	bill = new WaterBill(amount, dueDate);
	            break;   
	            
	        case 3:
	        	bill = new InternetBill(amount, dueDate);
	            break;
	            
	        default:
	        	System.out.println("Invalid bill choice.");
	        	return;
	    }
	    
	    System.out.println("\n---- Reminder ----");
        bill.sendReminder();
        
        System.out.print("\nDo you want to pay bill? (yes/no): ");
        String payChoice = input.next();
        
        if(payChoice.equalsIgnoreCase("yes")) {
        	bill.pay();
        	
        }
        else {
        	System.out.println("Bill not paid yet!");
            System.out.println("Amount with late fee (in Rs.): "+ bill.calculateLateFee(100));
        }
       
		input.close();
	}

}
