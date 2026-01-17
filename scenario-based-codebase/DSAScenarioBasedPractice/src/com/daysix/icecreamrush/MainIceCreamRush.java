/*1. IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.
Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons*/

package com.daysix.icecreamrush;

import java.util.Scanner;

public class MainIceCreamRush {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		IceCreams icecreams[]= {new IceCreams("Chocolate",6), new IceCreams("ButterScotch",7),new IceCreams("HazelNuts",8),
				new IceCreams("Blueberry",5),new IceCreams("Lime pinneaple",1),new IceCreams("Malai Kulfi",3),
				new IceCreams("Rajbhog",2), new IceCreams("Strawberry",4)};
		
	   
		IceCreamRushBubbleSort sorter = new IceCreamRushBubbleSort();
		
		
		System.out.println("-------------- Before Sorting -------------------------");
        sorter.display(icecreams);

        sorter.bubbleSort(icecreams);

        System.out.println("\n------------- After Sorting (By Popularity) ------------------");
        sorter.display(icecreams);
    }
}
