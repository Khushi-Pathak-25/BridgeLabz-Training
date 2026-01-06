package com.dayfour.yourpersonalfitnesstracker;

public class UserProfile {

	// name, age, weight, goal
	protected String name;
	protected int age;
	private double weight;
	protected double dailyTarget; // daily target 
	
	// constructor with default goal
	public UserProfile(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyTarget = 2500;
	}

	// constructor with custom goal
	public UserProfile(String name, int age, double weight, double dailyTarget) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyTarget = dailyTarget;
	}
	
	// getter for weight
	public double getWeight() {
		return weight;
	}
	// compute calorie targets and progress
	public double computeProgress(double caloriesBurned) {
		return dailyTarget- caloriesBurned;
	}
}
