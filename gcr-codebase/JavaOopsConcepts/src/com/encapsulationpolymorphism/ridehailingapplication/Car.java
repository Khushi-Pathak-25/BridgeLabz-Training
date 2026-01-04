package com.encapsulationpolymorphism.ridehailingapplication;

public class Car extends Vehicle implements GPS {
	
	// encapsulated attribute
   	private String currentLocation;

	public Car(int id, String driver, double rate, String location) {
        super(id, driver, rate);
	    this.currentLocation = location;
	}

    @Override
    public double calculateFare(double distance) {
	    return getRatePerKm() * distance + 50; // base charge
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
