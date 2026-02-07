package com.multithreading.bank;

public class Customer extends Thread{

	private int customerID;
	private Bank bank;
	private int accountNumber;
	
	public Customer(int customerID, Bank bank, int accountNumber) {
		this.customerID = customerID;
		this.bank = bank;
		this.accountNumber = accountNumber;	
	}
	
	public void run() {
		
		bank.deposit(accountNumber, 1000);
		bank.withdraw(accountNumber, 500);
		bank.deposit(accountNumber,2000);
		bank.withdraw(accountNumber, 2500);
	}
	
}
