package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle {

	// attribute
    private int batteryCapacity;

    // Constructor to initialize electric vehicle details
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method specific to electric vehicles
    public void charge() {
        System.out.println("Charging electric vehicle with " + batteryCapacity + " kWh battery");
    }
}