package com.interfaces.basic.smartdevice;

public class TV implements Device {
    private String brand;

    // constructor
    public TV(String brand) {
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " TV --> Switched ON");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " TV --> Switched OFF");
    }
}