package com.dayeight.gameboxapp;

public class StrategyGame extends Game {

	// paid game
	public StrategyGame(String title, double price, double rating) {
		super(title, "Strategy", price, rating);
	}

	// free game
	public StrategyGame(String title, double rating) {
		super(title, "Strategy", rating);
	}

	@Override
	public void playDemo() {
		System.out.println("=> Strategy Demo: 3-minute base building tutorial");
		System.out.println("   Build barracks -> train 5 soldiers -> destroy enemy outpost");
	}
}