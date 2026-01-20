/*6. MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming showtimes. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering*/

package com.dayeight.movietime;

import java.util.Scanner;
public class MainMovieTime {
	
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n======= Welcome to MovieTime App =======");
		
		System.out.print("Enter number of shows: ");
		int numberOfShows = input.nextInt();
		
		System.out.print("Enter shows time: ");
		int showsTime[]= new int[numberOfShows];
		
		for(int i=0 ;i<numberOfShows; i++) {
			showsTime[i] = input.nextInt();
		}
		
		MovieTimeInsertionSort.insertionSort(showsTime);
		MovieTimeInsertionSort.display(showsTime);
		
	}

}
