package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    
	// attribute
    private int fuelTankCapacity;

    // Constructor to initialize petrol vehicle details
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementation of interface method
    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle with " + fuelTankCapacity + " liters tank");
    }
}