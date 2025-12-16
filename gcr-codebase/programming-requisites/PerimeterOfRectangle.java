import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
	System.out.print("Enter the length of Rectangle : ");
	double length = s.nextDouble();
		
	System.out.print("Enter the Width of Rectangle : ");
	double width = s.nextDouble();
	s.close();

	System.out.println("The Perimeter Of Rectangle is : " + (2 * (length + width)));
    }
}