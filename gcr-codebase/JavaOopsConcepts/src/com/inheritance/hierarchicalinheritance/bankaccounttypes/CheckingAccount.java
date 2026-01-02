package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount{

	// attribute
	private double withdrawalLimit;
	
	// Constructor to initialize checking account details
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
    	// calling parent class constructor
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overridden method to specify account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type      :   Checking Account");
        System.out.println("Withdrawal Limit  : " + withdrawalLimit);
    }
}
