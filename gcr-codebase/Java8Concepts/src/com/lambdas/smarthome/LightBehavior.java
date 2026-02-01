package com.lambdas.smarthome;

// functional interface for light activation behavior
@FunctionalInterface
public interface LightBehavior {

	// Single abstract method which defines what pattern to apply
	void activate(String trigger);
}