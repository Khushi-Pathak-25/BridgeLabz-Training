/* 5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting*/

package com.dayseven.fitnesstracker;

import java.util.Scanner;

public class MainFitnessTracker {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n======= Welcome to Fitness Tracker =======");
		
		System.out.print("Enter number of people: ");
		int numberOfPeople = input.nextInt();
		
		int steps [] = new int[numberOfPeople];
		
		System.out.println("Enter steps counts");
		for(int i = 0 ;i<numberOfPeople ; i++) {
			
			System.out.print("Steps count of person "+(i+1)+" : ");
			steps[i] = input.nextInt();
			
		}
		
		TrackStepsBubbleSort.bubbleSort(steps);
		TrackStepsBubbleSort.display(steps);
		
	}

}
