package com.examples.bankingsystem;

import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        // HashMap 
        Map<Integer, Integer> accounts = new HashMap<>();
        accounts.put(1001, 50000);
        accounts.put(1002, 30000);
        accounts.put(1003, 70000);
        accounts.put(1004, 20000);

        //  Queue - Withdrawal requests (Account Numbers)
        Queue<Integer> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add(1002);
        withdrawalQueue.add(1004);
        withdrawalQueue.add(1001);

        System.out.println(" Processing Withdrawals:");

        // Fixed withdrawal amount for simplicity
        int withdrawalAmount = 10000;

        while (!withdrawalQueue.isEmpty()) {
            int accNo = withdrawalQueue.poll();

            if (accounts.get(accNo) >= withdrawalAmount) {
                accounts.put(accNo, accounts.get(accNo) - withdrawalAmount);
                System.out.println("Account " + accNo +
                        " withdrawal successful. Balance: Rs." + accounts.get(accNo));
            } else {
                System.out.println("Account " + accNo +
                        " has insufficient balance.");
            }
        }

        //  TreeMap- Sort customers by balance
        TreeMap<Integer, Integer> sortedByBalance = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
            sortedByBalance.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\n Customers Sorted by Balance:");

        for (Map.Entry<Integer, Integer> entry : sortedByBalance.entrySet()) {
            System.out.println("Account " + entry.getValue() +
                    " -> Balance Rs." + entry.getKey());
        }
    }
}
