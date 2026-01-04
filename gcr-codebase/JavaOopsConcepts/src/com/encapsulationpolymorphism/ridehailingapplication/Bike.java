package com.encapsulationpolymorphism.ridehailingapplication;

public class Bike extends Vehicle implements GPS {
	
	// encapsulated attribute
	private String currentLocation;

    public Bike(int id, String driver, double rate, String location) {
        super(id, driver, rate);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no base charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}


