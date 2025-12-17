import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion in yards(1 yard is 3 feet)
        double yards = distanceInFeet / 3;
        // Conversion in miles(1 mile = 1760 yards)
        double miles = yards / 1760;

        System.out.println("Your distance in yards is " + yards +
                           " while in miles is " + miles);
        sc.close();
    }
}
