package com.dayfive.loanbuddy;

public class AutoLoan extends LoanApplication {

	public AutoLoan(Applicant applicant, int term) {
		super(applicant, "Auto Loan", term, 10);
	}

	public boolean approveLoan() {
		if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 20000) {
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
