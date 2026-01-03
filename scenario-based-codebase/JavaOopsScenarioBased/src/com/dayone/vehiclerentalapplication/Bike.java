package com.dayone.vehiclerentalapplication;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 200);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type : Bike");
        System.out.println("Vehicle No   : " + vehicleNumber);
    }
}