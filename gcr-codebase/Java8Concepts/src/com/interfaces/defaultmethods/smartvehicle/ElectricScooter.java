package com.interfaces.defaultmethods.smartvehicle;

public class ElectricScooter implements Vehicle {
    private String brand;
    private int currentSpeed;
    private int batteryPercent;

    // constructor
    public ElectricScooter(String brand, int currentSpeed, int batteryPercent) {
	this.brand = brand;
	this.currentSpeed = currentSpeed;
	this.batteryPercent = batteryPercent;
    }

    @Override
    public void displaySpeed() {
	System.out.println(brand + " Scooter -> Current speed: " + currentSpeed + " km/h");
    }

    // override to show battery info
    @Override
    public void displayBatteryPercentage() {
	System.out.println(brand + " Scooter -> Battery: " + batteryPercent + "%");
	if (batteryPercent < 20) {
	    System.out.println("-> Low battery warning!");
	}
    }
}