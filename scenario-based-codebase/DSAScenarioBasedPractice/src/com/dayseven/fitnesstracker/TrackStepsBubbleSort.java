package com.dayseven.fitnesstracker;

public class TrackStepsBubbleSort {
	
	public static void bubbleSort(int steps[]) {
		
		int n = steps.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-1-i; j++) {
				if(steps[j]<steps[j+1]) {
					int temp = steps[j];
					steps[j] = steps[j+1];
					steps[j+1] = temp;
				}
			}
		}
	}
	public static void display(int steps[]) {
		
		System.out.println("---- FitnessTracker leaderboard Rank  ----");
		for(int value = 0; value< steps.length; value++) {
			System.out.println(" | "+(value+1)+" | "+steps[value] +" | ");
		}
		System.out.println("------------------------------------");
	}

}
