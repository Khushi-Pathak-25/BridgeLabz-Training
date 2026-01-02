package com.inheritance.singleinheritance.smarthome;

public class Device {

    // attributes
	protected String deviceId;
	protected String status;

	// Constructor to initialize device details
	public Device(String deviceId, String status) {
	    this.deviceId = deviceId;
	    this.status = status;
	}

	// Method to display device status
	public void displayStatus() {
	    System.out.println("Device ID : " + deviceId);
	    System.out.println("Status    : " + status);
    }
}
