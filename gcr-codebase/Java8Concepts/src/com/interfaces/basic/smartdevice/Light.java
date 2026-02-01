package com.interfaces.basic.smartdevice;

public class Light implements Device {
    private String room;

    // constructor
    public Light(String room) {
        this.room = room;
    }

    @Override
    public void turnOn() {
        System.out.println(room + " Light --> Turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println(room + " Light --> Turned OFF");
    }
}