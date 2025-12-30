/*14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.*/

import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char continueBooking = 'y';

        System.out.println("======================================");
        System.out.println("        MOVIE TICKET BOOKING APP       ");
        System.out.println("======================================");

        do {
            int movieFare = 0;
            int seatFare = 0;
            int snacksFare = 0;

            // ---------------- MOVIE TYPE ----------------
            while (true) {
                System.out.println("\n------- SELECT MOVIE TYPE -------");
                System.out.println("1. HOLLYWOOD  (Rs.300)");
                System.out.println("2. TOLLYWOOD  (Rs.250)");
                System.out.println("3. BOLLYWOOD  (Rs.200)");
                System.out.print("Enter your choice: ");

                int movieChoice = input.nextInt();

                switch (movieChoice) {
                    case 1:
                        movieFare = 300;
                        System.out.println("Hollywood movie selected ");
                        break;
                    case 2:
                        movieFare = 250;
                        System.out.println("Tollywood movie selected ");
                        break;
                    case 3:
                        movieFare = 200;
                        System.out.println("Bollywood movie selected ️");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        continue;
                }
                break;
            }

            // ---------------- SEAT TYPE ----------------
            while (true) {
                System.out.println("\n------ SELECT SEAT TYPE ------");
                System.out.print("Enter Gold / Silver: ");
                String seatType = input.next();

                if (seatType.equalsIgnoreCase("gold")) {
                    seatFare = 200;
                    break;
                } 
				else if (seatType.equalsIgnoreCase("silver")) {
                    seatFare = 100;
                    break;
                } 
				else {
                    System.out.println("Invalid seat type. Please enter again.");
                }
            }

            // ---------------- SNACKS ----------------
            while (true) {
                System.out.print("\nDo you want snacks? (YES / NO): ");
                String snackChoice = input.next();

                if (snackChoice.equalsIgnoreCase("yes")) {
                    snacksFare = 200;
                    System.out.println("Snacks added ");
                    break;
                } 
				else if (snackChoice.equalsIgnoreCase("no")) {
                    System.out.println("No snacks selected");
                    break;
                } 
				else {
                    System.out.println("Invalid input. Please enter YES or NO.");
                }
            }

            // ---------------- BILL ----------------
            System.out.println("\n--------------------------------");
            System.out.println("           TICKET BILL          ");
            System.out.println("--------------------------------");
            System.out.println("Movie Fare  : Rs. " + movieFare);
            System.out.println("Seat Fare   : Rs. " + seatFare);
            System.out.println("Snacks Fare : Rs. " + snacksFare);
            System.out.println("--------------------------------");
            System.out.println("Total Fare  : Rs. " + (movieFare + seatFare + snacksFare));
            System.out.println("--------------------------------");

            // Continue booking
            System.out.print("\nDo you want to book another ticket? (Y/N): ");
            continueBooking = input.next().charAt(0);

        } while (continueBooking == 'Y' || continueBooking == 'y');

        System.out.println("\nThank you for booking! Enjoy your movie ");
        input.close();
    }
}
