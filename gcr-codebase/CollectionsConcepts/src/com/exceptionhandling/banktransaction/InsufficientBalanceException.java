package com.exceptionhandling.banktransaction;

// Custom checked exception
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
