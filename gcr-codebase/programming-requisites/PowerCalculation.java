import java.util.Scanner;

class PowerCalculation {
    public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
		
	System.out.print("Enter the value of Base : ");
	double base = s.nextDouble();
		
	System.out.print("Enter the value of Exponent : ");
	double exponent = s.nextDouble();
	s.close();
		
	System.out.println(base + " raised to the power of " + exponent + " is : " + Math.pow(base, exponent));
    }
}