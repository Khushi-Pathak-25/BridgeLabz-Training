package com.inheritance.vehicleandtransport;

public class MotorCycle extends Vehicle {
   

    // Constructor to initialize motorcycle details
    public MotorCycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    // overridden method with motorcycle details
    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
