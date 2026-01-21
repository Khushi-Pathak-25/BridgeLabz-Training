/* 8. GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution*/

package com.dayeight.gamerzone;

import java.util.Scanner;

import com.dayeight.foodfest.Stall;

public class MainGamerZone {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Welcome to GamerZone =====");
		
		System.out.print("Enter number of players: ");
		int n = input.nextInt();
		input.nextLine();
		
		Player player[] = new Player[n];
		for(int i = 0; i<n; i++) {
			
			System.out.println("Enter details of player "+(i+1));
			
			System.out.print("Enter name: ");
			String name = input.nextLine();
			
			System.out.print("Enter score: ");
			int score = input.nextInt();
			input.nextLine();
			
			player[i]= new Player(name, score);
		}
		
		GamerZoneQuickSort.quickSort(player, 0, player.length-1);
		
		 System.out.println("\nSorted player rank :");
	        for (Player p : player) {
	            System.out.println(p.playerName + " - " + p.score);
	        }
			
	}
	
}
