/*4. E-Wallet Application
Scenario: Users can register, load money, transfer funds, and view transaction history.
Concepts Used:
● Class: User, Wallet, Transaction
● Constructors: Initialize wallets with optional referral bonus
● Access Modifiers: Make balance private, expose via getBalance()
● Interface: Transferrable with method transferTo(User receiver, double
amount)
● Operators: Used in deductions, taxes, referral credits
● OOP:
○ Encapsulation: Prevent direct manipulation of balance
○ Abstraction: Expose only essential transaction methods
○ Inheritance: PersonalWallet, BusinessWallet with different limits
○ Polymorphism: Same transferTo() method but different business logic*/


  package com.dayone.ewalletapplication;
  
  public class MainEWalletApplication {
  
  public static void main(String[] args) {
  
  User pawan = new User("Pawan", new PersonalWallet(3000)); 
  User aman = new User("Aman", new BusinessWallet(4000));
  
  //Polymorphism
  pawan.getWallet().transferTo(aman, 2000);
  aman.getWallet().transferTo(pawan, 1000);
  
  System.out.println("--------------------");
  System.out.println("Pawan Balance : Rs." + pawan.getWallet().getBalance());
  System.out.println("Aman Balance  : Rs." + aman.getWallet().getBalance());
  System.out.println("--------------------");
  
  System.out.println("Pawan Transactions:");
  pawan.getWallet().printTransactions(); } }
 