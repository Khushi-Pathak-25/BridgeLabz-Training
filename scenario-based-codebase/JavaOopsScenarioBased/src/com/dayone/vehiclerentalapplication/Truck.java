package com.dayone.vehiclerentalapplication;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 1800);
    }

    @Override
    public double calculateRent(int days) {
        double loadingCharge = 800;
        return (baseRate * days) + loadingCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type : Truck");
        System.out.println("Vehicle No   : " + vehicleNumber);
    }
}