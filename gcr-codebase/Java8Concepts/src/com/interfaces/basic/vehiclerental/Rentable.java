package com.interfaces.basic.vehiclerental;

public interface Rentable {
	
    // rents the vehicle for the given number of hours
    void rent(int hours);

    // returns the vehicle and shows total cost
    void returnVehicle();
}