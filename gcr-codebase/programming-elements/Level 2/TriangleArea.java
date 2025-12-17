import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input for base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;
        // Convert area to square inches (1 inch = 2.54 cm, so 1 sq in = 2.54^2 sq cm)
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "+ areaIn +" and sq cm is "+ areaCm);
        input.close();
    }
}
