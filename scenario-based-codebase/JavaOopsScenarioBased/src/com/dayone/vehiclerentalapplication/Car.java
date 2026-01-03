package com.dayone.vehiclerentalapplication;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 900);
    }

    @Override
    public double calculateRent(int days) {
        double insuranceCharge = 300;
        return (baseRate * days) + insuranceCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type : Car");
        System.out.println("Vehicle No   : " + vehicleNumber);
    }
}