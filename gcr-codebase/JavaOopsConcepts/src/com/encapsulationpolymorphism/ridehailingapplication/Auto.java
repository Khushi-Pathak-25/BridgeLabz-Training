package com.encapsulationpolymorphism.ridehailingapplication;

public class Auto extends Vehicle implements GPS {
	
	 // encapsulated attribute 
	 private String currentLocation;

	 public Auto(int id, String driver, double rate, String location) {
	     super(id, driver, rate);
	     this.currentLocation = location;
	 }

	 @Override
	 public double calculateFare(double distance) {
	     return (getRatePerKm() * distance) + 20; // small base charge
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
