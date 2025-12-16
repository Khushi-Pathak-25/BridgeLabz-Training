import java.util.Scanner;

class AverageOfThreeNumbers {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
	System.out.print("Enter the first number : ");
	double num1 = s.nextDouble();
		
	System.out.print("Enter the second number : ");
	double num2 = s.nextDouble();
		
	System.out.print("Enter the third number : ");
	double num3 = s.nextDouble();
	s.close();		

	System.out.println("Average of these three numbers is : " + ((num1 + num2 + num3) / 3));
    }
}