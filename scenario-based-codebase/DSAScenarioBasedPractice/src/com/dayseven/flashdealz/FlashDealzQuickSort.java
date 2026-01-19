package com.dayseven.flashdealz;

public class FlashDealzQuickSort {

	// quick sort method
	public static void quickSort( double discount[], int low, int high) {
		
		if(low< high) {
			
			// pivot index
			int pivotIndex = partition(discount, low, high);
			
			// recursive quick sort
			quickSort(discount, low, pivotIndex-1);
			quickSort(discount, pivotIndex+1, high);
			
		}
	}
	
	// method for partition
	public static int partition(double discount[], int low, int high) {
		
		double pivot = discount[high];
		
		int i = low-1;
		
		for(int j= low; j<high; j++) {
			if(discount[j]>pivot) {
				i++;
				// swap 
				double temp = discount[i];
				discount[i] = discount[j];
				discount[j] = temp;
 			}
		}
		
		i++;
		double temp = discount[i];	
		discount[i]= discount[high];
		discount[high] = temp;
		
		return i;
		
	}
	
	public static void display(double discount[]) {
		
		System.out.println("-------- Top discount on product (in %) -------");
		for(double value : discount) {
			System.out.print(value + " | ");
		}
		
	}
}
