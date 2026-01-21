/* 7. FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values*/

package com.dayeight.foodfest;

import java.util.Scanner;

public class MainFoodFest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("====== Welcome to FoodFest =====");
		
		System.out.print("Enter number of stalls: ");
        int n = input.nextInt();
        input.nextLine(); // consume newline
        
        Stall stalls[] = new Stall[n];
        
        for(int i =0 ;i<n; i++) {
        	System.out.println("\nEnter details for stall " + (i + 1));
        	
            System.out.print("Stall Zone: ");
            String zone = input.nextLine();
            
            System.out.print("Customer Footfall: ");
            int footfall = input.nextInt();
            input.nextLine(); // consume newline
            
            stalls[i] = new Stall(footfall, zone);
        	
        }
        
        FoodFestMergeSort.mergeSort(stalls, 0, stalls.length-1);
        
        System.out.println("\nSorted Stalls by Customer Footfall:");
        for (Stall s : stalls) {
            System.out.println(s.stallZone + " - " + s.footfall);
        }
		
	}
	
}
