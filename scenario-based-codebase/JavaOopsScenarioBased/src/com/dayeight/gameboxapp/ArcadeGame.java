package com.dayeight.gameboxapp;

public class ArcadeGame extends Game {

	// paid game
	public ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	// free game
	public ArcadeGame(String title, double rating) {
		super(title, "Arcade", rating);
	}

	@Override
	public void playDemo() {
		System.out.println("=> Arcade Demo: Fast 60-second action level!");
		System.out.println("   Tap-tap-tap... Dodge obstacles -> High score: 1240");
	}
}