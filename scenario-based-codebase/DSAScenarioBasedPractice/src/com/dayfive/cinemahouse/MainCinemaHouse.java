/*7. CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity*/

package com.dayfive.cinemahouse;

import java.util.Scanner;

public class MainCinemaHouse {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of shows: ");
		int numOfShow = input.nextInt();
		
		int showTimes[]= new int[numOfShow];
		
		for(int i = 0 ;i<numOfShow; i++) {
			System.out.print("Enter show "+(i+1)+" time (PM): ");
			showTimes[i]= input.nextInt();
		}
		
		BubbleSort.bubbleSort(showTimes);
		BubbleSort.display(showTimes);
		
	}
}
