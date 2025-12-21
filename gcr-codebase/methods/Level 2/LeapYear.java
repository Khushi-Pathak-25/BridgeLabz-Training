import java.util.Scanner;

public class LeapYear {

    // Create method to check leap year
    public static boolean isLeapYear(int year) {

        // Check Gregorian calendar condition
        if (year < 1582) {
            return false;
        }
        // Check Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
         
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
		// Take input from user 
        System.out.print("Enter year : ");
        int year = input.nextInt();
        
		// Display result
        if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } 
		else {
            System.out.println("Year is not a Leap Year");
        }

        input.close();
    }
}
