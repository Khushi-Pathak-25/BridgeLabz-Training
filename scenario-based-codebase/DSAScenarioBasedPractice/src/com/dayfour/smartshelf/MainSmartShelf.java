/*2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title*/

package com.dayfour.smartshelf;

import java.util.Scanner;
public class MainSmartShelf {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);	
		// take input
		System.out.println("===== Welcome to Smart Shelf =======");
		
		System.out.println("Enter Number of Books in digital library: ");
		int number = input.nextInt();
		 input.nextLine(); 
		
		// initialize books array
		String books[]= new String[number];
		
		System.out.println("Enter books name: ");
		for(int i =0; i< number ; i++) {		
			System.out.print("Enter book "+(i+1)+" name: ");
			books[i]= input.nextLine();
		}
		
		InsertionSort.sort(books);
		InsertionSort.display(books);
	}

}
