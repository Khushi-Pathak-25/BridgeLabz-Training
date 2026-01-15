/*1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records*/

package com.dayfour.hospitalqueue;

import java.util.Scanner;
import java.util.Arrays;

public class MainHospitalQueue {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=================== Welcome to Apollo Hospital ================\n");
		System.out.print("Enter number of Patient Arrived: ");
		int numOfPatient = input.nextInt();
		System.out.println();
		
		int criticalityLevel [] = new int[numOfPatient];
		
		System.out.println("Enter criticality level (1–10) of "+numOfPatient +" Patients: ");

		for(int i =0 ;i<numOfPatient ;i++) {
			
			System.out.print("Criticality Level of Patient whose arrival time is "+(i+1)+ "(P.M.): ");
			criticalityLevel [i] = input.nextInt();
		}
		
		BubbleSort.sortPatient(criticalityLevel);
		System.out.println("Arrage Patient by criticality level:");
		System.out.println(Arrays.toString(criticalityLevel));
	}

}
