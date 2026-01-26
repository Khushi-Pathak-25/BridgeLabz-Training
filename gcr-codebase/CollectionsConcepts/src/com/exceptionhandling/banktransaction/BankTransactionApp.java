package com.exceptionhandling.banktransaction;

import java.util.Scanner;

public class BankTransactionApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount account = new BankAccount(10000);

		try {
			System.out.print("Enter withdrawal amount: ");
			double amount = input.nextDouble();

			account.withdraw(amount);

		} catch (InsufficientBalanceException e) {
			// Handles custom checked exception
			System.out.println(e.getMessage());

		} catch (IllegalArgumentException e) {
			// Handles invalid amount
			System.out.println(e.getMessage());
		}

		input.close();
	}
}