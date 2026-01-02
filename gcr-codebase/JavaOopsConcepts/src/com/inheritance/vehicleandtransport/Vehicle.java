package com.inheritance.vehicleandtransport;

public class Vehicle {
    
	// attribute
    protected double maxSpeed;
    protected String fuelType;

    // Constructor to initialize vehicle details
    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // method to display vehicle information (to be overridden)
    public void displayInfo() {
        System.out.println("Max Speed : " + maxSpeed + " km/h");
        System.out.println("Fuel Type : " + fuelType);
    }
}