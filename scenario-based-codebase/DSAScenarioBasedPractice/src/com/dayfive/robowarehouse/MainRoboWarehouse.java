/*6. RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions*/

package com.dayfive.robowarehouse;

import java.util.Scanner;
public class MainRoboWarehouse {
	
	public static void main(String[]args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter number of packages: ");
	    int packages = input.nextInt();
	    System.out.println("Enter weight of packages: ");
	    int weights[]= new int[packages];
	    for(int i = 0; i<packages ;i++) {
	    	weights[i]= input.nextInt();
	    }   
	    InsertionSort.insertionSort(weights);
	    InsertionSort.display(weights);
	}
}
