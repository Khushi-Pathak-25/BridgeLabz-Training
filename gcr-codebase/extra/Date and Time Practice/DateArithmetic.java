import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Create LocalDate object
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("\nOriginal Date: " + date);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1) .plusYears(2);         

        System.out.println("After adding 7 days, 1 month, 2 years: " + updatedDate);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
