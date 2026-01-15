/*24. "GameBox – Mobile Game Distribution Platform"
Story: 
	● GameBox offers mobile games for download and purchase with features like demos, reviews, and leaderboards.
Requirements:
	● Game class: title, genre, price, rating.
	● User class with list of owned games.
	● Interface IDownloadable: download(), playDemo().
	● Constructors to set up free or paid games.
	● Use operators to apply seasonal offers.
	● Encapsulation: user-owned game data protected.
	● Inheritance: ArcadeGame, StrategyGame from Game.
	● Polymorphism: playDemo() behaves differently per genre.*/

package com.dayeight.gameboxapp;

public class MainGameBoxApp {
	public static void main(String[] args) {
		System.out.println("=== GameBox Store ===\n");

		// Create games (free and paid)
		Game pacman = new ArcadeGame("Pacman - classic", 0.0, 4.6);
		Game subway = new ArcadeGame("Subway Surfers", 149.0, 4.5);
		Game clash = new StrategyGame("Clash of Clans", 0.0, 4.3);
		Game mlbb = new StrategyGame("Mobile Legends", 499.0, 4.7);

		// Seasonal offer
		System.out.println("Summer Sale -30% on paid games!");
		subway.applyDiscount(30);
		mlbb.applyDiscount(30);

		// User
		User player = new User("Abhishek");

		// Download & purchase
		pacman.download();
		player.purchaseGame(pacman);

		subway.download();
		player.purchaseGame(subway);

		clash.download();
		player.purchaseGame(clash);

		mlbb.download();
		player.purchaseGame(mlbb);

		// Show user games library
		player.showLibrary();

		// Polymorphism
		player.playDemos();

		System.out.println("\n=== Thank you for using GameBox ===\n");
	}
}