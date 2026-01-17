/*9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering*/

package com.daysix.artexpo;

import java.util.Scanner;
public class MainArtExpo {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of Artists: ");
		int number = input.nextInt();
		
		System.out.println("==== NOTE: registration time in 24-hours format ====");
		System.out.println(" --------- Enter Registration Time ------------ ");
		int [] regTime = new int[number];
		
		for(int i =0 ;i<regTime.length; i++) {
			System.out.print("Enter Registration Time of artist "+(i+1)+" : ");
			regTime[i]= input.nextInt();
		}
		
		ArtExpoInsertionSort.insertionSort(regTime);
		ArtExpoInsertionSort.display(regTime);
	}
}
