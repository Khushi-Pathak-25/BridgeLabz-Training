package com.dayfive.loanbuddy;

public abstract class LoanApplication implements IApprovable {

	protected Applicant applicant; // Has - a relationship
	
	private String loanType;
	// encapsulated data
	protected int term;   // in months
	protected double interestRate;

	private boolean approved; // encapsulated
	
	public LoanApplication(Applicant applicant, String loanType, int term, double interestRate) {
		this.applicant = applicant;
		this.loanType = loanType;
		this.term = term;
		this.interestRate = interestRate;
	}
    
	protected void setApproved(boolean status) {
		this.approved = status;
	}
	
	public boolean isApproved() {
		return approved;
	}
	
	public String getLoanType() {
		return loanType;
	}
	
	@Override
	abstract public boolean approveLoan();
	@Override
	abstract public double calculateEMI();
	
	public void display() {
		applicant.display();
	}


}
