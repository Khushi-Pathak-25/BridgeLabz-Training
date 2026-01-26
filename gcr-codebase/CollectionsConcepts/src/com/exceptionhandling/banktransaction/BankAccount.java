package com.exceptionhandling.banktransaction;

public class BankAccount {
	private double balance;

	// constructor
	public BankAccount(double balance) {
		this.balance = balance;
	}

	// Withdraw method with exception handling
	public void withdraw(double amount) throws InsufficientBalanceException {

		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}

		balance -= amount;
		System.out.println("Withdrawal successful, new balance: " + balance);
	}
}
