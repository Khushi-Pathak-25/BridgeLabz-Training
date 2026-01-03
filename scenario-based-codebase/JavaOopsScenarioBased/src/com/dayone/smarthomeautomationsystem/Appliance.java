package com.dayone.smarthomeautomationsystem;

public abstract class Appliance implements Controllable {

    private boolean powerStatus;
    private int powerUsage;     
    public Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.powerStatus = false;
    }

    protected void setPowerStatus(boolean status) {
        powerStatus = status;
    }

    public boolean isOn() {
        return powerStatus;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public abstract void showStatus();
}