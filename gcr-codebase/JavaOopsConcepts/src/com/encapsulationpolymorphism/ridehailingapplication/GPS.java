package com.encapsulationpolymorphism.ridehailingapplication;

public interface GPS {
	
    // abstract methods
	String getCurrentLocation();

    void updateLocation(String newLocation);

}
