package com.multithreading.banking;

public class BankingSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, "Customer-1", 3000), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, "Customer-2", 4000), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, "Customer-3", 2000), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, "Customer-4", 5000), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, "Customer-5", 1500), "Customer-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
