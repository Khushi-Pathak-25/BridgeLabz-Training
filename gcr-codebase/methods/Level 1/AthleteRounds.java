import java.util.Scanner;

public class AthleteRounds {

    // Create static method to calculate rounds
    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
		// 5 km = 5000 meters
        return (5000 / perimeter);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
        // Sides in meters
        System.out.print("Enter first side:");
        double sideOne = input.nextDouble();

        System.out.print("Enter second side: ");
        double sideTwo = input.nextDouble();

        System.out.print("Enter third side: ");
        double sideThree = input.nextDouble();

        double rounds = calculateRounds(sideOne, sideTwo, sideThree);

        System.out.println("Number of rounds needed = " + rounds);
		
		input.close();
		
    }
}
