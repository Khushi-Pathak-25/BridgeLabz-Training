package com.interfaces.functional.temperaturealert;

import java.util.function.Predicate;

public class TemperatureSensor {
    private double currentTemperature;

    // constructor
    public TemperatureSensor(double initialTemperature) {
	this.currentTemperature = initialTemperature;
    }

    // update temperature reading
    public void setTemperature(double temperature) {
	this.currentTemperature = temperature;
    }

    // check if alert should be triggered using given Predicate
    public void checkAndAlert(Predicate<Double> alertCondition) {
	if (alertCondition.test(currentTemperature)) {
	    System.out.println("ALERT! Temperature " + currentTemperature + "°C crossed the defined threshold!");
	} else {
	    System.out.println("Temperature " + currentTemperature + "°C is within safe range.");
	}
    }

    // good string representation
    @Override
    public String toString() {
	return "Current temperature: " + currentTemperature + "°C";
    }
}