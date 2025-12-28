package com.constructors.levelone;

public class BankAccount {

	// Public variable
    public String accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // access current balance
    public double getBalance() {
        return balance;
    }

    // Updates balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Displays account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
