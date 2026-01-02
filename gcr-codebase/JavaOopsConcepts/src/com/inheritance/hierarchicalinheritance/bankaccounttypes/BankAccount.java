package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccount {

	// attributes
    protected String accountNumber;
    protected double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }

    // Method to be overridden by subclasses
    public void displayAccountType() {
        System.out.println("Account Type   : Bank Account");
    }
}