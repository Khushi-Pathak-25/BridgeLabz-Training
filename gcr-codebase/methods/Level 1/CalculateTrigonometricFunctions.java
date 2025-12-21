import java.util.Scanner;

public class CalculateTrigonometricFunctions {

    // Create method to calculate sine, cosine and tangent
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert degree to radian using Math class function
        double radians = Math.toRadians(angle);
        
		// Calculate trigonometric functions using Math class function
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
		// return value of sine, cosine and tangent
        return new double[]{ sine,cosine,tangent};
    }

    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);

        // Taking angle value from user
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
        
		// Create object of class CalculateTrigonometricFunctions
        CalculateTrigonometricFunctions object = new CalculateTrigonometricFunctions();

        // Calling method and store result in array 
        double[] result = object.calculateTrigonometricFunctions(angle);
        
		// Display output
        System.out.println("Sine value = " + result[0]);
        System.out.println("Cosine value = " + result[1]);
        System.out.println("Tangent value = " + result[2]);
		
		input.close();
    }
}
