package com.dayone.hospitalpatientmanagementsystem;

public class Bill implements Payable {
    
	// attributes 
	private double baseAmount;
	private double tax;
	private double discount;

	// constructor
	public Bill(double baseAmount, double tax, double discount) {
		this.baseAmount = baseAmount;
		this.tax = tax;
		this.discount = discount;
	}

	@Override
	public double calculatePayment() {
		double taxAmount = baseAmount * tax;
		return baseAmount + taxAmount - discount;
	}
}
