import java.util.Scanner;

public class CheckCollinearPoints {

    // check collinearity using slope formula
    public static boolean isCollinearBySlope(
            int x1, int y1, int x2, int y2, int x3, int y3) {

        // Using cross multiplication to avoid division
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // check collinearity using area of triangle formula
    public static boolean isCollinearByArea(
            int x1, int y1, int x2, int y2, int x3, int y3) {

        double area = 0.5 * ( x1 * (y2 - y3) +  x2 * (y3 - y1) +  x3 * (y1 - y2) );
		
		// if area is equal to zero then points are collinear
        return area == 0;
    }

    // main method
    public static void main(String[] args) {
        
		// Create Scanner class object
        Scanner input = new Scanner(System.in);
        
		// Take inputs from user
        System.out.print("Enter x1 y1 : ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter x2 y2 : ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("Enter x3 y3 : ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Check collinearity using slope method
        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope method.");
        } 
		else {
            System.out.println("Points are not collinear using slope method.");
        }

        // Check collinearity using area method
        if (isCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area of triangle method.");
        } 
		else {
            System.out.println("Points are not collinear using area of triangle method.");
        }

        input.close();
    }
}
