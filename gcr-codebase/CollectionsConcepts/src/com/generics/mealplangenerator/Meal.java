package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {

	private T mealPlan;

	// Constructor
	public Meal(T mealPlan) {
		this.mealPlan = mealPlan;
	}

	// Returns meal plan
	public T getMealPlan() {
		return mealPlan;
	}

	// Generate the meal
	public void serveMeal() {
		mealPlan.generateMeal(); // Polymorphism
	}
}
