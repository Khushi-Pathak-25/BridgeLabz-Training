package com.dayeight.homenest;

public class Light extends SmartDevice {
	// On scale of 0 to 100
	@SuppressWarnings("unused")
	private int brightness = 50;

	public Light(String deviceId) {
		super(deviceId);
	}

	@Override
	public void turnOn() {
		setStatus(true);
		// small amount per action
		addEnergyUsage(0.05);
		System.out.println(getDeviceId() + " -> Light ON");
	}

	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println(getDeviceId() + " -> Light OFF");
	}

	@Override
	public void reset() {
		brightness = 50;
		setStatus(false);
		System.out.println(getDeviceId() + " -> Light reset (brightness 50%, OFF)");
	}

	public void setBrightness(int level) {
		if (level >= 0 && level <= 100) {
			brightness = level;
			if (isOn()) {
				// more brightness = more energy
				addEnergyUsage(level * 0.001);
			}
		}
	}
}
