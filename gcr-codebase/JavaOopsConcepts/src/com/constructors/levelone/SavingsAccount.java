package com.constructors.levelone;

public class SavingsAccount extends BankAccount {
	
    // constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
    	// calling parent class constructor 
        super(accountNumber, accountHolder, balance);
    }

    // method access to public and protected members
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    // main
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("SBI0765", "Khushi", 100000.0);

        account.displaySavingsAccountDetails();

        account.setBalance(99999);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}