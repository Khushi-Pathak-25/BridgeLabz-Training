import java.util.Scanner;

public class SimpleInterest {

    // Create static method to calculate simple interest
    static double calculateSI(double principal, double rate, double time) {
        return (principal*rate*time) / 100;
    }
	
    public static void main(String[] args) {
	
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Taking inputs from user
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        // Calling calculateSI method 
        double simpleInterest = calculateSI(principal, rate, time);

        // Display output
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                "  and Time " + time );
				
		input.close();		
    }
}
