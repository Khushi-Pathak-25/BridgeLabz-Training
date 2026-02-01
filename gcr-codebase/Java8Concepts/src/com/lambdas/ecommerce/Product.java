package com.lambdas.ecommerce;

public class Product {
	private String name;
	private double price;
	private double rating; // (out of 5)
	private int discountPercent;

	// constructor
	public Product(String name, double price, double rating, int discountPercent) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discountPercent = discountPercent;
	}

	// getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	@Override
	public String toString() {
		return String.format("%-20s | Price: Rs.%.2f | Rating: %.1f | Discount: %d%%", name, price, rating,
				discountPercent);
	}
}