/*Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. 
A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class 
and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers 
and the bank.*/

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