package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
    
	// attributes
    protected String model;
    protected int maxSpeed;

    // Constructor to initialize vehicle details
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // method to display vehicle information
    public void displayInfo() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}