package com.multithreading.bank;

import java.util.*;
public class Bank {
	
	private final Map<Integer, Integer> accounts = new HashMap<>();
	
	public synchronized void addAccount(int accountNumber, int balance) {
		accounts.put(accountNumber, balance);
	}

	public synchronized void deposit(int accountNumber, int amount) {
		int balance = accounts.get(accountNumber);
	    balance += amount;
	    accounts.put(accountNumber, balance);
	    System.out.println(Thread.currentThread().getName()+
	    		           "Deposit: "+amount+" | "+" Balance: "+balance);
	}
	
	public synchronized void withdraw(int accountNumber, int amount) {
		
		int balance = accounts.get(accountNumber);
		if(balance>amount) {
			balance -= amount;
			accounts.put(accountNumber, balance);
			System.out.println(Thread.currentThread().getName()+
				           "Withdraw: "+amount+" | "+"Balance: "+balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+
			           "Withdraw: "+amount+" insufficient balance");
		}	
		
	}
	
	public synchronized int getBalance(int accountNumber) {
		
		return  accounts.get(accountNumber); // get value --> balance
	}
}
