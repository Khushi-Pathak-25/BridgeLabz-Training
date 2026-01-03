package com.dayone.smarthomeautomationsystem;

public class Fan extends Appliance {

    public Fan() {
        super(60);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan is spinning");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan is stopped");
    }

    @Override
    public void showStatus() {
        System.out.println("Fan Status : " + (isOn() ? "ON" : "OFF"));
    }
}