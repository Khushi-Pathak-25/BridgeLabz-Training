package com.interfaces.basic.smartdevice;

public class AC implements Device {
    private String location;

    // constructor
    public AC(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println(location + " AC --> Powered ON (cooling started)");
    }

    @Override
    public void turnOff() {
        System.out.println(location + " AC --> Powered OFF");
    }
}