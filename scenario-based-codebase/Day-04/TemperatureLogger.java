/* 11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String args[]) {
	
	    Scanner input = new Scanner(System.in);
		
		// Record temperatures over 7 days
	    double temperature [] = new double [7];
		double sumTemperature; 
		double maxTemperature;
		
		
		System.out.println(" Temperature Logger 7 days : \n");
		System.out.println("================================");
		
		// Take input for Day 1 separately
        System.out.print("Enter Day 1 temperature (in °C ): ");
        temperature[0] = input.nextDouble();

        sumTemperature = temperature[0];
        maxTemperature = temperature[0];
 
		// for loop ( Take inputs for temperature)
		for( int i = 1 ; i < temperature.length ; i++){
			
            System.out.print("Enter Day "+(i+1)+" temperature (in °C ): ");
            temperature[i] = input.nextDouble(); 	
			
			// calculate sum for average 
            sumTemperature += temperature[i] ;

            // calculate max temperature 
			if(temperature[i] > maxTemperature){
			    maxTemperature = temperature[i];		  
			}      			
		
		}
		
		// Calculate Average Temperature
		double averageTemperature = sumTemperature / temperature.length;
	    
		// Display output
		System.out.println("\n TEMPERATURE REPORT");
        System.out.println("--------------------------------");
        System.out.printf("Average Temperature : %.2f °C\n", averageTemperature);
        System.out.printf("Maximum Temperature : %.2f °C\n", maxTemperature);
        System.out.println("--------------------------------");

        input.close();
	
	}

}