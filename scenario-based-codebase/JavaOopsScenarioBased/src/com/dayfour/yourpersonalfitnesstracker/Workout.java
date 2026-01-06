package com.dayfour.yourpersonalfitnesstracker;

public abstract class Workout implements ITrackable{

	// track type, duration, caloriesBurned
	protected String trackType;
	protected double duration;
	protected double caloriesBurned;
	
	public Workout(String trackType, double duration) {
		this.trackType = trackType;
		this.duration = duration;
	}
	
	// calculate calories
	public abstract double calculateCalories();
	
	public void startWorkout() {
		System.out.println(trackType+" Workout started...");
	}
	
	public void stopWorkout() {
		System.out.println(trackType+" Workout stopped!");
	}
	
	protected double getCalories() {
		return caloriesBurned;
	}
	
}

