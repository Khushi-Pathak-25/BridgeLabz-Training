package com.daytwo.mybank;

abstract class Account implements ITransaction {
	
	// fields like accountNumber, balance
	protected String accountNumber;  // protected: accessible to child classes
	private double balance;         // encapsulation
	
	// Constructor with opening balance
	public Account(String accountNumber,double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // getter (no direct access to balance)
	protected double getBalance() {
		return balance;
	}

	//  setter only for internal use
	 protected void setBalance(double balance) {
		this.balance = balance;
	}
	 
    
	 @Override
	 public void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println("Deposit successful");
	     } 
	     else {
	            System.out.println("Invalid deposit amount");
	        }
	}
     
     @Override
     public void withdraw(double amount) {
    	 if(amount > 0 && amount <= balance) {
    		 balance -= amount;
    		 System.out.println("Withdrawal successfully");
    	 }
    	 else {
    		 System.out.println("Invalid withdrawal amount or Insufficient balance");
    	 }
     }
	
     @Override
     public void checkBalance() {
         System.out.println("Current Balance: " + balance);
     }

     // Polymorphism 
     abstract void calculateInterest();
	
}
