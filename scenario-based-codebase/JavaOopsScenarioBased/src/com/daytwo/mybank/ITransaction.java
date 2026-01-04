package com.daytwo.mybank;

public interface ITransaction {

	public void deposit(double amount) ;
	public void withdraw(double amount) ;
	public void checkBalance() ;
}
