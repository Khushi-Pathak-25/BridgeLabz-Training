package com.constructors.levelone;

public class CarRental {
	
	// attributes - customerName, carModel, and rentalDays
	String customerName ;
	String carModel;
	int rentalDays;
	double ratePerDay = 500;
	
	// constructor 
	CarRental (String customerName , String carModel, int rentalDays){
	    this.customerName= customerName;
	    this.carModel= carModel;
	    this.rentalDays = rentalDays;
	    
	}
	// calculate total cost
	public double calculateTotalCost() {
		return rentalDays*ratePerDay;
	}
	// display output
	public void display() {
        System.out.println("Customer Name: " + customerName + ", Car Model: " + carModel +
                ", Total Cost: " + calculateTotalCost());
    }

    // main 
    public static void main(String[] args) {
        CarRental rental = new CarRental("Ringo", "BMW", 5);
        rental.display();
    }

}
