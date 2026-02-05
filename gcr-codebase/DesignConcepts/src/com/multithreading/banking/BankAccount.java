package com.multithreading.banking;

public class BankAccount {

    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            // simulate delay
            try {
                Thread.sleep(100); // 0.1 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance - amount;
            return true;
        }
        return false;
    }
}
