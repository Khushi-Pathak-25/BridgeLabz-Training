package com.inheritance.vehicleandtransport;

public class Truck extends Vehicle {

    // Constructor to initialize truck details
    public Truck(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    // Overridden method with truck-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}