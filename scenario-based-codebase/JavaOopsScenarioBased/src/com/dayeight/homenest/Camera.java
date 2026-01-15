package com.dayeight.homenest;

public class Camera extends SmartDevice {

	@SuppressWarnings("unused")
	private boolean recording = false;

	public Camera(String deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus(true);
		addEnergyUsage(0.12);
		System.out.println(getDeviceId() + " -> Camera ON");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		recording = false;
		System.out.println(getDeviceId() + " -> Camera OFF");
	}

	@Override
	public void reset() {
		setStatus(false);
		recording = false;
		System.out.println(getDeviceId() + " -> Camera reset | firmware log cleared");
	}

	public void startRecording() {
		if (isOn()) {
			recording = true;
			addEnergyUsage(0.25);
			System.out.println(getDeviceId() + " -> Recording started");
		}
	}
}