import java.util.Scanner;

public class Quadratic {

    // Create method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // delta is negative, nothing(empty array)
        if (delta < 0) 
		{
            return new double[0];
        }

        // delta is zero, one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // delta is positive, two roots
        double sqrtDelta = Math.sqrt(delta);

        double root1 = (-b + sqrtDelta)/(2 * a);
        double root2 = (-b - sqrtDelta)/(2 * a);
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
	
        // Create Scanner class object
        Scanner input = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter value of a : ");
        double a = input.nextDouble();

        System.out.print("Enter value of b : ");
        double b = input.nextDouble();

        System.out.print("Enter value of c : ");
        double c = input.nextDouble();

        // Calling method 
        double[] roots = findRoots(a, b, c);

        // Display result
		
        if (roots.length == 0) {
            System.out.println("No real roots(Delta is negative).");
        } 
		else if (roots.length == 1) {
            System.out.println("Only one root exists : " + roots[0]);
        } 
		else {
            System.out.println("Two roots exist:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        }

        input.close();
    }
}
