package com.dayfour.zipzipmart;

public class Transaction {

	protected String date;
	protected double amount;
	protected String branch;
	
	public Transaction(String date, double amount, String branch) {
		this.date = date;
		this.amount = amount;
		this.branch = branch;
	}
	
	 void display() {
	        System.out.println(date + " | Rs." + amount + " | " + branch);
	    }
}
