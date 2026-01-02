package com.inheritance.singleinheritance.smarthome;

public class Thermostat extends Device {

	// attribute
    private double temperatureSetting;

    // Constructor to initialize thermostat details
    public Thermostat(String deviceId, String status, double temperatureSetting) {
    	// calling Device class constructor
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overridden method to display thermostat status
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}