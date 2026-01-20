package com.generics.mealplangenerator;

public class MealUtil {

	// Generic method with bounded type parameter
	public static <T extends MealPlan> void generatePersonalizedMeal(T meal) {

		// Validation (only valid MealPlan types allowed)
		System.out.println("Valid meal plan selected.");

		// Generate meal
		meal.generateMeal();
	}
}
