/* 10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists*/

package com.daysix.fleetmanager;

import java.util.Scanner;

public class MainFleetManager {

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        // Depot 1
	        System.out.print("Enter number of vehicles in Depot 1: ");
	        int n1 = input.nextInt();
	        int depot1[] = new int[n1];

	        System.out.println("Enter sorted mileage for Depot 1:");
	        for (int i = 0; i < n1; i++) {
	            depot1[i] = input.nextInt();
	        }

	        // Depot 2
	        System.out.print("Enter number of vehicles in Depot 2: ");
	        int n2 = input.nextInt();
	        int depot2[] = new int[n2];

	        System.out.println("Enter sorted mileage for Depot 2:");
	        for (int i = 0; i < n2; i++) {
	            depot2[i] = input.nextInt();
	        }

	        // merge depot lists
	        int masterSchedule[] = FleetManagerMergeSort.mergeDepots(depot1, depot2);

	        // display final schedule
	        FleetManagerMergeSort.display(masterSchedule);
	    }
}
