package com.daynine.payxpress;

public class Bill implements IPayable {

	// type, amount, dueDate, isPaid
	protected String type;
	protected double amount;
	protected String dueDate;
	protected boolean isPaid;
	
	public Bill(String type, double amount, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}	
	
	// late fee calculation using operators
    public double calculateLateFee(double penalty) {
        return amount + penalty;   // operator usage
    }

	 // encapsulation payment status controlled internally
    @Override
	public void pay() {
		if(! isPaid) {
			isPaid = true;
			System.out.println(type+" bill paid successfully!");
		}
		else {
            System.out.println(type + " bill already paid!");
        }
	}
    // getter
    public boolean isPaid() {
    	return isPaid;
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Pay your bill before " + dueDate);
    }
}
