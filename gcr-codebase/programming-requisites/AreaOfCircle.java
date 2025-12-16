import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter the radius of circle : ");
	double radius = s.nextDouble();
	s.close();		

	double circleArea = Math.PI * radius * radius;
	System.out.println("Area of Circle is : " + circleArea);
    }
}
		