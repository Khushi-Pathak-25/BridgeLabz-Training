package com.inheritance.vehicleandtransport;

public class Car extends Vehicle {
    
	// attribute
    private int seatCapacity;

    // Constructor to initialize car details
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overridden method with car details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }
}