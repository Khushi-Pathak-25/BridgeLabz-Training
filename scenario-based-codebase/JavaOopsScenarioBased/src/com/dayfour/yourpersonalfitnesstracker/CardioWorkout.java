package com.dayfour.yourpersonalfitnesstracker;

public class CardioWorkout extends Workout{

	public CardioWorkout( double duration) {
		super("Cardio", duration);
	}

	@Override
	public double calculateCalories() {
		caloriesBurned = duration * 10;  // cardio burns more calories
		return caloriesBurned;
	}
}
