package com.objectmodeling.bankmanagement;

import java.util.Scanner;

public class MainBankAndCustomer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		String customerName = input.nextLine();

		System.out.print("Enter bank name: ");
		String bankName = input.nextLine();

		// Creating independent Bank and Customer objects
		Bank bank = new Bank(bankName);
		Customer customer = new Customer(customerName);

		// Opening account using association
		Account account = bank.openAccount(customer);

		System.out.print("Enter deposit amount: ");
		double amount = input.nextDouble();

		account.deposit(amount);

		// Viewing balance from customer side
		customer.viewBalance();
		input.close();
	}
}