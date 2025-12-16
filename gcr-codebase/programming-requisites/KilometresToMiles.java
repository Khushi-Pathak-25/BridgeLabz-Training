import java.util.Scanner;

class KilometresToMiles {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
	System.out.print("Enter the value in Kilometres : ");
	double kilometres = s.nextDouble();
	s.close();
		 
	final double KmToMileFactor = 0.621371;
	System.out.println("The value in miles is : " + (kilometres * KmToMileFactor ));
    }
}