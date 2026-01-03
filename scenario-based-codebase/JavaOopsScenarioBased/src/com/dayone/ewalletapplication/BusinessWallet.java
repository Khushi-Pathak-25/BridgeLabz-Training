package com.dayone.ewalletapplication;

public class BusinessWallet extends Wallet {

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.03;
        double total = amount + tax;

        if (amount <= 8000 && debit(total)) {
            receiver.getWallet().credit(amount);
            System.out.println("Business Wallet Transfer Successful (3% tax applied)");
        } 
        else {
            System.out.println("Transfer Failed (Limit or Balance)");
        }
    }
}