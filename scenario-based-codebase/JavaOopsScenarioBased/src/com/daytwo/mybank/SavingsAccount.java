package com.daytwo.mybank;

public class SavingsAccount extends Account {

	private final double interestRate = 4.0; // 4%
	
	public SavingsAccount(String accountNumber,double balance) {
		super(accountNumber,balance);
	}

	@Override
	public void  calculateInterest() {
		// calculate interest rate
		double interest = getBalance() * interestRate / 100;
		
		// set amount to balance
	    setBalance(getBalance() + interest);
	    System.out.println("Interest added to Savings Account");	
		
	}

}
