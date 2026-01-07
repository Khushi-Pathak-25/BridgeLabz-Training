package com.dayfive.loanbuddy;

public class Applicant {
	
	// name, creditScore, income, loanAmount
	private String name;
	private int creditScore;
	private double income;
	private double loanAmount;
	
	public Applicant(String name, int creditScore, double income, double loanAmount) {
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount;
	}
	// getters
	public String getName() {
		
		return name;
	}
	
	public double getLoanAmount() { 
		
		return loanAmount;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public double getIncome() {
		return income;
	}
	
	public void display () {
		
		System.out.println("Name: "+ name);
		System.out.println("Credit Score: "+creditScore);
		System.out.println("Income: "+ income);
		System.out.println("Loan Amount: "+loanAmount);
		
	}
	

}
