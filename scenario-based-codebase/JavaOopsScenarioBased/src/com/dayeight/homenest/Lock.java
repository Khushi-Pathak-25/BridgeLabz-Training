package com.dayeight.homenest;

public class Lock extends SmartDevice {

	public Lock(String deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		// "on" means locked for a smart lock
		setStatus(true);
		addEnergyUsage(0.01);
		System.out.println(getDeviceId() + " -> Door LOCKED");
	}

	@Override
	public void turnOff() {
		// "off" means unlocked
		setStatus(false);
		System.out.println(getDeviceId() + " -> Door UNLOCKED");
	}

	@Override
	public void reset() {
		// reset -> safe state = locked
		setStatus(true);
		System.out.println(getDeviceId() + " -> Lock reset to LOCKED");
	}
}
