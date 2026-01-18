package com.dayfive.cropmonitor;

public class SensorReading {
	
	protected long timestamp;
	protected double temperature;
	
	public SensorReading(long timestamp, double temperature) {
		this.timestamp = timestamp;
		this.temperature = temperature;
	}
	
}
