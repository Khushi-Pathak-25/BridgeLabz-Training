/* 13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.Scanner;

public class FitnessChallengeTracker {
    public static void main(String [] args){
	
	    Scanner input = new Scanner (System.in);
		
		int day[]= new int [7];
		
		// input 
		System.out.println("======================================");
        System.out.println("   SANDEEP'S FITNESS CHALLENGE  ");
        System.out.println("======================================");
		
		for(int i =0 ;i< day.length ; i++){
			System.out.print("Enter push-up on day "+(i+1)+": ");
		    day[i]= input.nextInt();
		}
		
	    int totalPushUp = 0;
        int workoutDays = 0;

        for (int j : day) {
            if (j == 0) {
			// skip rest days	
             continue;   
            }
            totalPushUp += j;
            workoutDays++;
        }

        double averagePushUp = (workoutDays > 0) ? (double) totalPushUp / workoutDays: 0;
		
		// Output 
        System.out.println("\n======================================");
        System.out.println("        WEEKLY REPORT ");
        System.out.println("======================================");

        for (int i = 0; i < day.length; i++) {
            System.out.println("--------------------------------------");
            if (day[i] == 0) {
                System.out.println("Day " + (i + 1) + " : REST DAY ");
                continue;
            }
            System.out.println("Day " + (i + 1) + " : " + day[i] + " push-ups ");
        }

        System.out.println("--------------------------------------");
        System.out.println("Total Push-ups   : " + totalPushUp);
        System.out.println("Workout Days     : " + workoutDays);
        System.out.printf("Average Push-ups : %.2f\n", averagePushUp);
        System.out.println("======================================");		
		
		input.close();
	
	}

}