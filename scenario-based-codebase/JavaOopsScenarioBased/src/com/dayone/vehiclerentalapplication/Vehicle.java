package com.dayone.vehiclerentalapplication;

public abstract class Vehicle implements Rentable {
    
	// attributes
    protected String vehicleNumber;
    protected double baseRate;

    // constructor
    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    // getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }

    // method to be overridden by subclasses
    public abstract void displayDetails();
}
