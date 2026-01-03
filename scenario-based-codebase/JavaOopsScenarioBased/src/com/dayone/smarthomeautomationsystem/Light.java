package com.dayone.smarthomeautomationsystem;

public class Light extends Appliance {

    public Light() {
        super(20); 
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light is turned ON");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light is turned OFF");
    }

    @Override
    public void showStatus() {
        System.out.println("Light Status : " + (isOn() ? "ON" : "OFF"));
    }
}
