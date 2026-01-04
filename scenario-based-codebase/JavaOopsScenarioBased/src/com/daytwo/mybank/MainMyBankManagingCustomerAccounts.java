/*7. "MyBank – Managing Customer Accounts"
Story: You're building the core banking module for MyBank, a digital-first bank. Your job is to
manage customer accounts, deposits, and interest calculations.
Requirements:
● Account (base class): fields like accountNumber, balance.
● Derived classes: SavingsAccount, CurrentAccount (using inheritance).
● ITransaction interface: deposit(), withdraw(), checkBalance().
● Use constructors for account initialization with or without an opening balance.
● Encapsulation: balance must be private and only modifiable through methods.
● Use operators for interest: balance * interestRate / 100.
● Polymorphism in calculateInterest() – varies by account type.
● Use access modifiers: protect account data, expose only required operations.*/

package com.daytwo.mybank;

import java.util.Scanner;

public class MainMyBankManagingCustomerAccounts {
	
	public static void main(String []args) {
		
	    Scanner input =new Scanner(System.in);
	    Account account;
	    
	    System.out.println("====== Welcome to MyBank ======");
	
	    System.out.println("Choose Account Type:");
	    System.out.println("1. Saving Account");
	    System.out.println("2. Current Account");
	    System.out.print("Enter Your Choice: ");
	    int userChoice = input.nextInt();
	    
	    System.out.print("Enter Account Number: ");
        String accountNumber = input.next();
	    
        System.out.print("Enter Opening Balance: ");
        double balance = input.nextDouble();
        
        if(userChoice == 1) {	
        	account = new SavingsAccount(accountNumber,balance);
        }
        else {
        	account = new CurrentAccount(accountNumber, balance);
        }
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);

        account.calculateInterest();
        account.checkBalance();
	    
        input.close();
	    
    }
}