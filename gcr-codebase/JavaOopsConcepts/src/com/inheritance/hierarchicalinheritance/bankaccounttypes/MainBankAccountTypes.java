/*Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. 
BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount,
each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes
while inheriting from a shared superclass.*/

package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class MainBankAccountTypes {
	
	public static void main(String[] args) {

	    BankAccount a1 = new SavingsAccount("SBI111", 50000, 10);
	    BankAccount a2 = new CheckingAccount("AU112", 20000, 1000 );
	    BankAccount a3 = new FixedDepositAccount("PB113", 1000, 5);
	
	    a1.displayDetails();
        a1.displayAccountType();
        System.out.println("----------------------");

        a2.displayDetails();
        a2.displayAccountType();
        System.out.println("----------------------");

        a3.displayDetails();
        a3.displayAccountType();
	
    }
}