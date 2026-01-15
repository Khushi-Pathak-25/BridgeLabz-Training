package com.dayeight.gameboxapp;

import java.util.ArrayList;
import java.util.List;

public class User {
	private final String username;
	// Encapsulation: Owned games cannot be modified directly from outside
	private final List<Game> ownedGames = new ArrayList<>();

	public User(String username) {
		this.username = username;
	}

	public void purchaseGame(Game game) {
		if (game.getPrice() <= 0) {
			System.out.println("=> Adding free game: " + game.getTitle());
		} else {
			System.out.printf("=> Purchased: %s for Rs.%.2f%n", game.getTitle(), game.getPrice());
		}
		System.out.println();
		ownedGames.add(game);
	}

	public void showLibrary() {
		System.out.println(username + "'s Game Library:");
		if (ownedGames.isEmpty()) {
			System.out.println("  (empty)");
			return;
		}
		for (Game g : ownedGames) {
			System.out.println("  * " + g);
		}
	}

	public void playDemos() {
		System.out.println("\nPlaying from library...");
		for (Game g : ownedGames) {
			System.out.println("\nPlaying " + g.getTitle() + ":");
			g.playDemo();
		}
	}
}