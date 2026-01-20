package com.generics.mealplangenerator;

public class MealPlanGeneratorApp {

	public static void main(String[] args) {

		Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());

		Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());

		Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());

		Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

		// Serving meals
		vegMeal.serveMeal();
		veganMeal.serveMeal();

		// Using generic method
		MealUtil.generatePersonalizedMeal(new KetoMeal());
		MealUtil.generatePersonalizedMeal(new HighProteinMeal());
	}
}
