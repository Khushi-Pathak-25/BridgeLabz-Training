package com.interfaces.staticmethods.dateformat;

import java.time.LocalDate;
import java.util.Scanner;

public class DateFormatUtilityApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======  Invoice Date Format Utility ====");
        System.out.println("All dates formatted using static methods in DateFormatter interface");
        System.out.println("---------------------------------------------------------------");

        System.out.print("Enter date (yyyy-MM-dd) or press Enter for today: ");
        String dateInput = input.nextLine().trim();

        LocalDate date;
        if (dateInput.isEmpty()) {
            date = LocalDate.now();
            System.out.println("Using today's date: " + date);
        } else {
            try {
                date = LocalDate.parse(dateInput);
            } catch (Exception e) {
                System.out.println("Invalid date format. Using today's date.");
                date = LocalDate.now();
            }
        }

        System.out.println("\nAvailable formats:");
        System.out.println("1 - DD-MM-YYYY (25-07-2025)");
        System.out.println("2 - YYYY-MM-DD (ISO)");
        System.out.println("3 - DD MMMM YYYY (25 July 2025)");
        System.out.println("4 - MMMM DD, YYYY (October 25, 2025)");
        System.out.print("Choose format (1-4): ");

        int choice = input.nextInt();

        String formattedDate = "";
        switch (choice) {
            case 1:
                formattedDate = DateFormatter.formatDDMMYYYY(date);
                break;
            case 2:
                formattedDate = DateFormatter.formatYYYYMMDD(date);
                break;
            case 3:
                formattedDate = DateFormatter.formatFullMonth(date);
                break;
            case 4:
                formattedDate = DateFormatter.formatInvoiceStyle(date);
                break;
            default:
                System.out.println("Invalid choice. Using DD-MM-YYYY.");
                formattedDate = DateFormatter.formatDDMMYYYY(date);
                break;
        }

        System.out.println("\nFormatted date: " + formattedDate);

        // Bonus: show current date in all formats
        System.out.println("\nToday's date in all formats:");
        System.out.println("DD-MM-YYYY     : " + DateFormatter.formatDDMMYYYY(LocalDate.now()));
        System.out.println("YYYY-MM-DD     : " + DateFormatter.formatYYYYMMDD(LocalDate.now()));
        System.out.println("Full Month     : " + DateFormatter.formatFullMonth(LocalDate.now()));
        System.out.println("Invoice Style  : " + DateFormatter.formatInvoiceStyle(LocalDate.now()));

        input.close();
    }
}