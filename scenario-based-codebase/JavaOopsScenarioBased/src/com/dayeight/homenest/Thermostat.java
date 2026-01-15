package com.dayeight.homenest;

public class Thermostat extends SmartDevice {
	
	@SuppressWarnings("unused")
	private double temperature = 24.0; // in celsius

	public Thermostat(String deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus(true);
		addEnergyUsage(1.2);
		System.out.println(getDeviceId() + " -> AC/Thermostat ON");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println(getDeviceId() + " -> Thermostat OFF");
	}

	@Override
	public void reset() {
		temperature = 24.0;
		setStatus(false);
		System.out.println(getDeviceId() + " -> Thermostat reset to 24°C, OFF");
	}

	public void setTemperature(double temp) {
		if (temp >= 16 && temp <= 30) {
			temperature = temp;
			if (isOn()) {
				addEnergyUsage(Math.abs(temp - 24) * 0.15);
			}
		}
	}
}