package com.lambdas.banking;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BankingLambdas {

    static class Account {
        String holderName;
        double balance;

        public Account(String holderName, double balance) {
            this.holderName = holderName;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return holderName + " - Balance: ₹" + balance;
        }
    }

    public static void main(String[] args) {
        // 1. Minimum balance rule (≥ 1000)
        Predicate<Double> minBalanceRule = balance -> balance >= 1000;
        System.out.println("1. Minimum balance check:");
        System.out.println("1500 ==> " + minBalanceRule.test(1500.0));
        System.out.println("800 ==> " + minBalanceRule.test(800.0));

        // 2. Simple interest (P * R * T / 100)
        BiFunction<Double, Integer, Double> simpleInterest = (principal, years) -> principal * 0.07 * years;
        System.out.println("\n2. Simple interest (7% rate):");
        System.out.println("Rs. 10,000 for 3 years ==> Rs." + simpleInterest.apply(10000.0, 3));

        // 3. Validate withdrawal
        BiPredicate<Double, Double> canWithdraw = (balance, amount) -> amount > 0 && amount <= balance;
        System.out.println("\n3. Withdrawal validation:");
        System.out.println("Balance 5000, withdraw 3000 ==> " + canWithdraw.test(5000.0, 3000.0));
        System.out.println("Balance 5000, withdraw 6000 ==> " + canWithdraw.test(5000.0, 6000.0));

        // 4. Print account details
        Consumer<Account> printAccount = acc ->
                System.out.println("Account holder: " + acc.holderName + ", Balance: Rs." + acc.balance);
        System.out.println("\n4. Account details:");
        printAccount.accept(new Account("Khushi Pathak", 24500));
        printAccount.accept(new Account("Shagun Pathak", 8700));

        // 5. Compare two account balances
        BiConsumer<Account, Account> compareBalances = (a1, a2) -> {
            if (a1.balance > a2.balance) {
                System.out.println(a1.holderName + " has more balance");
            } else if (a1.balance < a2.balance) {
                System.out.println(a2.holderName + " has more balance");
            } else {
                System.out.println("Both have equal balance");
            }
        };
        System.out.println("\n5. Balance comparison:");
        compareBalances.accept(new Account("Veena", 45000), new Account("Seena", 32000));
    }
}