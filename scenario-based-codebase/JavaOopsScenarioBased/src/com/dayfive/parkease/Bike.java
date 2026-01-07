package com.dayfive.parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 30);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = (hours > 4) ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}

