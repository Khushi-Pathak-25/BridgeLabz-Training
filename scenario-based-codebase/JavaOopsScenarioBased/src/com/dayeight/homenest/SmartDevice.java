package com.dayeight.homenest;

public abstract class SmartDevice implements IControllable {
	private final String deviceId;
	
	// on = true, off = false
	private boolean status = false; 
	
	// energy usage in kWh
	private double energyUsage = 0.0;

	// Protected constructor: only subclasses can create instances
	protected SmartDevice(String deviceId) {
		if (deviceId == null || deviceId.trim().isEmpty()) {
			throw new IllegalArgumentException("Device ID cannot be empty");
		}
		this.deviceId = deviceId;
	}

	// Encapsulation: only subclasses can update status & energy
	protected void setStatus(boolean on) {
		this.status = on;
	}

	protected void addEnergyUsage(double amount) {
		if (amount > 0) {
			this.energyUsage += amount;
		}
	}

	// Public getters 
	public String getDeviceId() {
		return deviceId;
	}

	public boolean isOn() {
		return status;
	}

	public double getEnergyUsage() {
		return energyUsage;
	}

	// Common string representation
	@Override
	public String toString() {
		return String.format("%s (%s) - Energy: %.2f kWh", deviceId, status ? "ON" : "OFF", energyUsage);
	}

	// method for combining energy usage
	public double plusEnergy(SmartDevice other) {
		return this.energyUsage + other.energyUsage;
	}
}