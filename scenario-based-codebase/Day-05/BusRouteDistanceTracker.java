/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String args[]){
	
	    Scanner input = new Scanner(System.in);
		double totalDistance = 0;
		String userExitChoice = "no";
		
		System.out.println("==========================================");
        System.out.println("    Bus Route Distance Tracker Started   ");
        System.out.println("==========================================");
		
		while(!userExitChoice.equalsIgnoreCase("yes")){
		    
			System.out.print("Enter distance travelled at this stop (in km): ");
		    double distance = input.nextDouble();
			
			// calculate distance
			totalDistance += distance;
			
			System.out.println("Do you want to get off at a stop?");
			System.out.print("Enter YES or NO : ");
			userExitChoice = input.next();
		    	
		}
		System.out.println("---------------------------------");
		System.out.println("Total Distance: "+totalDistance);
		System.out.println("Thank You Visit Again !");
		System.out.println("---------------------------------");
		
		input.close();
	}
}