package com.daytwo.mybank;

public class CurrentAccount extends Account{
	
	private final double interestRate = 1.0; // 1%

	public CurrentAccount(String accountNumber,double balance) {
		super(accountNumber,balance);
	}

	@Override
	public void calculateInterest() {
		double interest = getBalance() * interestRate / 100;
		
		setBalance(getBalance()+interest);
		System.out.println("Interest added to Current Account");
		
	}
}
