package com.daysix.smartlibrary;

public class SmartLibraryInsertionSort {
	
	// method to sort books by title
	public static void insertionSort(String booksTitle[], int size) {

		for(int i = 1 ; i<size ;i++) {
			
			String key = booksTitle[i];
			int j = i-1;
			
			while(j>=0 && booksTitle[j].compareToIgnoreCase(key)>0) {			
				booksTitle[j+1] = booksTitle[j];
				j--;
			}
			booksTitle[j+1] = key;
		}
	}
	
	//method to display books
	public static void display(String booksTitle[], int size) {
		
		System.out.println("\n------------------- Sorted books are -----------------");
        for (int i = 0; i < size; i++) {
            System.out.print(booksTitle[i] + " | ");
        }
	}

}
