/* 2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data*/

package com.daysix.smartlibrary;

import java.util.Scanner;

public class MainSmartLibrary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("====== Welcome to SmartLibrary ========");

		System.out.print("\nEnter number of books in library: ");
		int numberOfBooks = input.nextInt();
		input.nextLine();

		String[] title = new String[numberOfBooks];

		System.out.println("-------Enter title of books---------");

		for (int i = 0; i < title.length; i++) {
			System.out.print("Title Book " + (i + 1) + " : ");
			title[i] = input.nextLine();

			// Auto-sort after every new book
			SmartLibraryInsertionSort.insertionSort(title, i+1);
		}

		SmartLibraryInsertionSort.display(title, numberOfBooks);

	}

}
