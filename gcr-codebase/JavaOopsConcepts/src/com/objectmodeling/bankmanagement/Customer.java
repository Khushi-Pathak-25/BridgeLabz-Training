package com.objectmodeling.bankmanagement;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Account> accounts;

    // constructor to initialize customer
    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    // method to add account to customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // method to view balances of all accounts
    public void viewBalance() {
        System.out.println("\nCustomer Name: " + name);

        // loop to display all associated accounts
        for (Account account : accounts) {
            System.out.println("-----------------------");
            account.displayAccount();
        }
    }
}