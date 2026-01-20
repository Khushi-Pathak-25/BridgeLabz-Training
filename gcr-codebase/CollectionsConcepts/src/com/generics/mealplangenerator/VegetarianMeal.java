package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {

	@Override
	public void generateMeal() {
		System.out.println("Vegetarian Meal: Dal, Roti, Sabji, Salad");
	}
}
