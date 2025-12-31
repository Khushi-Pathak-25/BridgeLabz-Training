/* 16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

import java.util.Scanner;

public class DigitalWatchSimulation{

    public static void main(String []args){
	
	    // Scanner input = new Scanner(System.in);
		
		System.out.println("\n===========================");
		System.out.println(" Digital Watch Simulation ");
		System.out.println("===========================");
		
		// for loop for hours
		for(int hours = 0 ; hours<24 ; hours++){
		    for(int minutes = 0; minutes<60 ; minutes++){
			    System.out.printf("%2d %2s  : %2d %2s\n", hours,"hours" ,minutes,"minutes");
                System.out.println("------------------------");
				// check for break condition
				if(hours == 13 && minutes == 0){
					System.out.println("======================");
				    System.out.println("Power Cut...Watch stop");
					System.out.println("======================");
					return;
				}
                				
			}
		
		}
	
	}
}