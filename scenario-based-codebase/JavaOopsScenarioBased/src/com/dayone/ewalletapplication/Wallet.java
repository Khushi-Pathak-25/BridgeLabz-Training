package com.dayone.ewalletapplication;

import java.util.ArrayList;

public abstract class Wallet implements Transferrable {

    private double balance;
    protected ArrayList<Transaction> transactions;
    
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    protected void credit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Credit", amount));
    }

    protected boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
