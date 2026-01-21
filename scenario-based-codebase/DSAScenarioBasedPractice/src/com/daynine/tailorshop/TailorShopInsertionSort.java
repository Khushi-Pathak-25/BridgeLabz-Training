package com.daynine.tailorshop;

public class TailorShopInsertionSort {
	
	 public static void insertionSort(Order order[]) {
		 
		 for(int i = 1; i<order.length; i++) {	 
		     Order current = order[i];
		     
		     int j = i-1;
		     
		     while(j>=0 && order[j].deliverydate.isAfter(current.deliverydate)) {
		    	 order[j+1] = order[j];
		    	 j--;

		     }	     
		     order[j+1] = current;
	      }
	 }

}
