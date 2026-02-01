package com.lambdas.smarthome;

public class SmartLight {
	private String name;
	private boolean isOn;

	public SmartLight(String name) {
		this.name = name;
		this.isOn = false;
	}

	// Method to apply behavior based on trigger
	public void applyBehavior(LightBehavior behavior, String trigger) {
		System.out.print(name + " -> ");
		behavior.activate(trigger);

		// Simple state change simulation
		isOn = !trigger.equals("off");
		System.out.println("Light is now " + (isOn ? "ON" : "OFF"));
	}

	// Good string representation
	@Override
	public String toString() {
		return name + " (" + (isOn ? "ON" : "OFF") + ")";
	}
}