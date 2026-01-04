package com.encapsulationpolymorphism.bankingsystem;

interface Loanable {

	// abstract method
    void applyForLoan(double amount);
    
    boolean calculateLoanEligibility();
}
