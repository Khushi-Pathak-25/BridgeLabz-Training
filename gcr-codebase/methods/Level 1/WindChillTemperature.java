import java.util.Scanner;

public class WindChillTemperature {

    // Create method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        
		// Calculate the wind chill temperature
        double windChillTemp = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChillTemp;
    }

    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);
        
		// Take inputs from user
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();
		
		// Create object of class WindChillCalculator 
		WindChillTemperature object = new WindChillTemperature();
     
	    // Calling method by object and store output in result variable
        double result = object.calculateWindChill(temperature, windSpeed);
        
		// Display output
        System.out.println("Wind Chill Temperature = " + result);
		
		input.close();
    }
}
