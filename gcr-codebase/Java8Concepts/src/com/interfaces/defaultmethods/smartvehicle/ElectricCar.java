package com.interfaces.defaultmethods.smartvehicle;

public class ElectricCar implements Vehicle {

    private String model;
    private int currentSpeed;
    private int batteryPercent;

    // constructor
    public ElectricCar(String model, int currentSpeed, int batteryPercent) {
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.batteryPercent = batteryPercent;
    }

    @Override
    public void displaySpeed() {
        System.out.println(model + " (Electric) → Current speed: " + currentSpeed + " km/h");
    }

    // custom override for battery display
    @Override
    public void displayBatteryPercentage() {
        System.out.println(model + " -> Battery level: " + batteryPercent + "% remaining");
        if (batteryPercent <= 15) {
            System.out.println("-> Please charge soon - range limited");
        }
    }
}