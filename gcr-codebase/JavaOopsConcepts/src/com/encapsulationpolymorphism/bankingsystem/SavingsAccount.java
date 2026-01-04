package com.encapsulationpolymorphism.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

 
    private double loanAmount;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Savings account interest (4%)
    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}
