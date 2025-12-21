import java.util.Scanner;

public class LineAndEuclideanDistance {

    // create method to compute Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        
		// Using Math class function
        double distanceOfPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distanceOfPoints;
    }

    // Method to find slope and y-intercept
    // Returns array where:
    // index 0 --> slope (m)
    // index 1 -->y-intercept (b)
	
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double[] results = new double[2];

        double m = (y2 - y1) / (x2 - x1);   // slope
        double b = y1 - (m * x1);           // y-intercept

        results[0] = m;
        results[1] = b;

        return results;
    }

    // main method
    public static void main(String[] args) {
	
        // Create Scanner class object
        Scanner input = new Scanner(System.in);
        
		// Taking input from user
        System.out.print("Enter x1 : ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1 : ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2 : ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2 : ");
        double y2 = input.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Equation of line : y = " + line[0] + "x + " + line[1]);

        input.close();
    }
}
