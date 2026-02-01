package com.interfaces.basic.vehiclerental;

public class Bus implements Rentable {
    private String type;
    private double ratePerHour;
    private boolean isRented;
    private int rentedHours;

    // constructor
    public Bus(String type, double ratePerHour) {
        this.type = type;
        this.ratePerHour = ratePerHour;
        this.isRented = false;
        this.rentedHours = 0;
    }

    @Override
    public void rent(int hours) {
        if (isRented) {
            System.out.println(type + " bus is already rented.");
            return;
        }
        isRented = true;
        rentedHours = hours;
        System.out.println(type + " bus rented for " + hours + " hours  Rs." + ratePerHour + "/hr");
    }

    @Override
    public void returnVehicle() {
        if (!isRented) {
            System.out.println(type + " bus is not currently rented.");
            return;
        }
        double totalCost = rentedHours * ratePerHour;
        System.out.println(type + " bus returned -> Total cost: Rs." + totalCost);
        isRented = false;
        rentedHours = 0;
    }
}