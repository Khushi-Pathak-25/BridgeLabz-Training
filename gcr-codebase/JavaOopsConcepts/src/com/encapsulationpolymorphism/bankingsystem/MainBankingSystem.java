/*4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/

package com.encapsulationpolymorphism.bankingsystem;

import java.util.*;

public class MainBankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nAccount " + i);
            sc.nextLine(); // clear buffer

            System.out.print("Enter Account Number: ");
            String accNo = sc.nextLine();

            System.out.print("Enter Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Account Type (1-Savings, 2-Current): ");
            int type = sc.nextInt();

            BankAccount acc;

            if (type == 1) {
                acc = new SavingsAccount(accNo, name, balance);
            } else {
                acc = new CurrentAccount(accNo, name, balance);
            }

            accounts.add(acc);
        }

        // Polymorphism demonstration
        for (BankAccount acc : accounts) {

            acc.displayAccountDetails();

            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            // Loan processing using interface
            Loanable loanAcc = (Loanable) acc;

            System.out.print("Enter loan amount to apply: ");
            double loanAmt = sc.nextDouble();
            loanAcc.applyForLoan(loanAmt);

            if (loanAcc.calculateLoanEligibility()) {
                System.out.println("Loan Approved.");
            } else {
                System.out.println("Loan Not Approved.");
            }

            System.out.println("---------------------------");
        }

        sc.close();
    }
}

