package com.objectmodeling.bankmanagement;

public class Account {
    int accountNumber;
    double balance;
    Bank bank;

    // constructor to link account with a bank
    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    // method to deposit money into account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Bank Name     : " + bank.bankName);
        System.out.println("Account No    : " + accountNumber);
        System.out.println("Balance       : " + balance);
    }
}

