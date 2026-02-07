package com.multithreading.bank;

import java.util.*;
public class BankMain {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		Bank bank = new Bank();
		
		int accountNumber = 111;
		bank.addAccount(accountNumber,1000);
		
		Customer c1 = new Customer(1,bank,accountNumber);
		Customer c2 = new Customer(2,bank,accountNumber);
		Customer c3 = new Customer(3,bank,accountNumber);
		
		// start thread
		c1.start();
		c2.start();
		c3.start();
		
		// wait for all threads to finish
		try {
			c1.join();
			c2.join();
			c3.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		// final balance
		System.out.println("\nFinal Balance: " +
                bank.getBalance(accountNumber));
	}
}
