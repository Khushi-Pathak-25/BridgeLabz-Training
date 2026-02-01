package com.interfaces.basic.vehiclerental;

public class Car implements Rentable {
	
    private String model;
    private double ratePerHour;
    private boolean isRented;
    private int rentedHours;

    // constructor
    public Car(String model, double ratePerHour) {
        this.model = model;
        this.ratePerHour = ratePerHour;
        this.isRented = false;
        this.rentedHours = 0;
    }

    @Override
    public void rent(int hours) {
        if (isRented) {
            System.out.println(model + " is already rented.");
            return;
        }
        isRented = true;
        rentedHours = hours;
        System.out.println(model + " car rented for " + hours + " hours Rs." + ratePerHour + "/hr");
    }

    @Override
    public void returnVehicle() {
        if (!isRented) {
            System.out.println(model + " is not currently rented.");
            return;
        }
        double totalCost = rentedHours * ratePerHour;
        System.out.println(model + " returned -> Total cost: Rs." + totalCost);
        isRented = false;
        rentedHours = 0;
    }
}