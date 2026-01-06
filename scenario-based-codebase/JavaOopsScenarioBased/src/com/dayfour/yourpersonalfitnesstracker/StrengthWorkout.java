package com.dayfour.yourpersonalfitnesstracker;

public class StrengthWorkout extends Workout {

	public StrengthWorkout(double duration) {
		super("Strength", duration);
	}
	
	@Override
	public double calculateCalories() {
		caloriesBurned = duration * 5;  // Strength burns less calories
		return caloriesBurned;
	}

}
