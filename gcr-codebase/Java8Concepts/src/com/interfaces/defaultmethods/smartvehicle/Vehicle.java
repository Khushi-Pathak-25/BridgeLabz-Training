package com.interfaces.defaultmethods.smartvehicle;

public interface Vehicle {

    // original method - all vehicles must implement
    void displaySpeed();

    // default method added later for electric vehicles
    // non-electric vehicles don't need to override it
    default void displayBatteryPercentage() {
        System.out.println("Battery status: Not applicable (non-electric vehicle)");
    }
}