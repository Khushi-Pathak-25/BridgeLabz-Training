package com.dayeight.gameboxapp;

public abstract class Game implements IDownloadable {
	private final String title;
	private final String genre;
	protected double price; // can be changed by offers
	private double rating; // 0.0–5.0

	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = Math.max(0.0, Math.min(5.0, rating));
	}

	// For free games
	public Game(String title, String genre, double rating) {
		this(title, genre, 0.0, rating);
	}

	// getters
	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	// Method to appy seasonal discount
	public void applyDiscount(double percentage) {
		if (percentage < 0 || percentage > 100)
			return;
		this.price = this.price * (1 - percentage / 100);
		System.out.printf("Applied %.0f%% discount -> new price: Rs.%.2f%n", percentage, this.price);
	}

	@Override
	public void download() {
		System.out.println("Downloading: " + title + " (" + genre + ")");
	}

	// To be overridden (polymorphism)
	@Override
	public abstract void playDemo();

	@Override
	public String toString() {
		return String.format("%-25s %-12s Rs.%06.2f   Rating: %.1f", title, genre, price, rating);
	}
}