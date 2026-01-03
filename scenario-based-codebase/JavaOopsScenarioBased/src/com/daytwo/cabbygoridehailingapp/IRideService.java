package com.daytwo.cabbygoridehailingapp;

public interface IRideService {

	// method bookRide() and endRide()
	public void bookRide(Vehicle vehicle, Driver driver, double distance);
	public void endRide();
	
}
