package com.encapsulationpolymorphism.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private double loanAmount;

	public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
	}

    // Current account interest (2%)
    @Override
	public double calculateInterest() {
	    return getBalance() * 0.02;
	}

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
	}

    @Override
	public boolean calculateLoanEligibility() {
	    return getBalance() >= 10000;
    }
}
	
