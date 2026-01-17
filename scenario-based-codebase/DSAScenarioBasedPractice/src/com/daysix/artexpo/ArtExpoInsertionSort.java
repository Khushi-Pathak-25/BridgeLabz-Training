package com.daysix.artexpo;

public class ArtExpoInsertionSort {

	// sort method
	public static void insertionSort(int regTime[]) {
		
		int length = regTime.length;
		
		for(int i = 1; i<length ; i++) {
			int key = regTime[i];
		    int	j= i-1;
		    
		    while(j>=0 && regTime[j]>key) {
		    	regTime[j+1]= regTime[j];
		    	j--;
		    }
			
		    regTime[j+1]=key;
		}
	}
	
	// display method
	public static void display(int regTime[]) {
		System.out.println("Sorted Registration Time (in 24-hours format):");
		for(int value : regTime) {
			
			System.out.print(value +" ");
		}
		
	}
	
}
