package com.dayfour.smartshelf;

public class InsertionSort {

	// sort books
	public static void sort(String[]books) {
		
		for(int i = 1;i<books.length; i++) {
			String key = books[i];
			int j = i-1;
			
			while(j>=0 && books[j].compareToIgnoreCase(key)>0) {			
				books[j+1]= books[j];
				j--;
			}
			books[j+1] = key;
		}
		
	}
	// display sorted book
	public static void display(String books[]) {
		System.out.println("-----------------Books in library-----------------------");
		for(String value : books) {
			System.out.print(value +" | ");
		}
	}
}
