package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    
	// attribute
    private int tenureYears;

    // Constructor to initialize fixed deposit account details
    public FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
    	// calling parent class constructor
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    // Overridden method to specify account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type   : Fixed Deposit Account");
        System.out.println("Tenure         : " + tenureYears + " years");
    }
}
