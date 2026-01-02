package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {
    
	// attribute 
    private double interestRate;

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
    	// calling parent class constructor
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overridden method to specify account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}
