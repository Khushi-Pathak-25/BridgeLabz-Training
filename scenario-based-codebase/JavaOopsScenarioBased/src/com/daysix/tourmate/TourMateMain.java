/*18. "TourMate – Travel Itinerary Planner"
Story: TourMate helps travelers plan and book trips by organizing activities, transportation, and
stays.
Requirements :

● Trip class: destination, budget, duration.
● Transport, Hotel, Activity are associated.
● Interface IBookable with book() and cancel() methods.
● Encapsulation: hide cost breakdown inside services.
● Use constructors to generate complete trip packages.
● Operators: total budget = hotel + transport + activities.
● Inheritance: InternationalTrip, DomesticTrip extend Trip.
● Polymorphism: book() logic differs based on trip type.*/

package com.daysix.tourmate;

import java.util.Scanner;

public class TourMateMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter duration (days): ");
        int duration = sc.nextInt();

        System.out.print("Enter transport cost: ");
        double transportCost = sc.nextDouble();

        System.out.print("Enter hotel cost: ");
        double hotelCost = sc.nextDouble();

        System.out.print("Enter activity cost: ");
        double activityCost = sc.nextDouble();

        Transport transport = new Transport(transportCost);
        Hotel hotel = new Hotel(hotelCost);
        Activity activity = new Activity(activityCost);

        System.out.println("\nSelect Trip Type:");
        System.out.println("1. Domestic Trip");
        System.out.println("2. International Trip");
        int choice = sc.nextInt();

        Trip trip;

        if (choice == 1) {
            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
        } else {
            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
        }

        trip.book();
        // trip.cancel(); // optional

        sc.close();
    }
}
