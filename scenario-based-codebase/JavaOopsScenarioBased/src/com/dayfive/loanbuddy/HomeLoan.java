package com.dayfive.loanbuddy;

public class HomeLoan extends LoanApplication {

	public HomeLoan(Applicant applicant, int term) {
		super(applicant, "Home Loan", term, 9.0);
	}

	public boolean approveLoan() {
		if (applicant.getCreditScore() >= 750 && applicant.getIncome() >= 40000) {
			setApproved(true);
		} else {
			setApproved(false);
		}
		return isApproved();
	}

	// calculate EMI
	public double calculateEMI() {

		double P = applicant.getLoanAmount();
		double R = interestRate / (12 * 100);
		int N = term;

		return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
	}


}
