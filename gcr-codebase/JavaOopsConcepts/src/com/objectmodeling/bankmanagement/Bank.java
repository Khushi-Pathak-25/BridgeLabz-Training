package com.objectmodeling.bankmanagement;


public class Bank {
    String bankName;
    int nextAccountNumber = 111;

    // constructor to initialize bank
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // method to open account for customer (association logic)
    public Account openAccount(Customer customer) {
        Account account = new Account(nextAccountNumber, this);
        nextAccountNumber++;

        customer.addAccount(account);
        return account;
    }
}