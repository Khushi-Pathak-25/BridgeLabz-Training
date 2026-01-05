package com.daythree.thegroceryshoppingapp;

public abstract class Product {
	private String name;
	private double price;
	private String category;

	// Constructor
	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	// Encapsulation (no setter for price)
	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	// Polymorphism
	public abstract double applyDiscount(double price);
}
