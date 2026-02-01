package com.interfaces.basic.vehiclerental;

public class Bike implements Rentable {
	
    private String brand;
    private double ratePerHour;
    private boolean isRented;
    private int rentedHours;

    // constructor
    public Bike(String brand, double ratePerHour) {
        this.brand = brand;
        this.ratePerHour = ratePerHour;
        this.isRented = false;
        this.rentedHours = 0;
    }

    @Override
    public void rent(int hours) {
        if (isRented) {
            System.out.println(brand + " bike is already rented.");
            return;
        }
        isRented = true;
        rentedHours = hours;
        System.out.println(brand + " bike rented for " + hours + " hours  Rs." + ratePerHour + "/hr");
    }

    @Override
    public void returnVehicle() {
        if (!isRented) {
            System.out.println(brand + " bike is not currently rented.");
            return;
        }
        double totalCost = rentedHours * ratePerHour;
        System.out.println(brand + " bike returned -> Total cost: Rs." + totalCost);
        isRented = false;
        rentedHours = 0;
    }
}