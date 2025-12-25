import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // first date input
        System.out.print("Enter first date (year month day): ");
        int y1 = input.nextInt();
        int m1 = input.nextInt();
        int d1 = input.nextInt();

        // second date input
        System.out.print("Enter second date (year month day): ");
        int y2 = input.nextInt();
        int m2 = input.nextInt();
        int d2 = input.nextInt();

        // create LocalDate objects
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        // compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } 
		else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        }
		else if (date1.isEqual(date2)) {
            System.out.println("Both dates are SAME.");
        }
    }
}
