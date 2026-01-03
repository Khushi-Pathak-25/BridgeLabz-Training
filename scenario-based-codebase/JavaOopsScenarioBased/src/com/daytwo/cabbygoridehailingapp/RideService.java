package com.daytwo.cabbygoridehailingapp;

public class RideService implements IRideService {
	
	// sensitive data
	private double fare;  
	
	@Override
	public void bookRide(Vehicle vehicle, Driver driver, double distance) {
		
		fare = vehicle.calculateFare(distance);
		System.out.println("-----------------------------");
		System.out.println(" Ride Booked Successfully!");
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Driver Name: " + driver.getName());
        System.out.println("Driver Rating: " + driver.getRating());
        System.out.println("Total Fare: Rs." + fare);
	}
	
	public void endRide() {
		System.out.println("Ride Ended... Thank you for using CabbyGo");		
	}
}
