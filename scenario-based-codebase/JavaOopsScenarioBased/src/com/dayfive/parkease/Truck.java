package com.dayfive.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = (hours > 3) ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
