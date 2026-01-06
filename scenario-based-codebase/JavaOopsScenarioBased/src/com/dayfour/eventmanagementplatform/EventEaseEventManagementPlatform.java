/*13. "EventEase – Event Management Platform"
Story: EventEase helps users organize events like birthdays, weddings, and conferences.
You’re responsible for the booking and scheduling module.
Requirements:
● Event class: eventName, location, date, attendees.
● User class to represent the organizer.
Scenario-based Problems
● Constructors to create events with or without catering/decoration packages.
● ISchedulable interface with methods schedule(), reschedule(), cancel().
● Use access modifiers to restrict editing of eventId once assigned.
● Use operators to calculate costs (venue + services – discounts).
● Inheritance: BirthdayEvent, ConferenceEvent extend Event.
● Polymorphism: schedule() behaves differently based on event type.
● Apply encapsulation to protect pricing and sensitive user data.*/

package com.dayfour.eventmanagementplatform;

import java.util.Scanner;

public class EventEaseEventManagementPlatform {

	public static void main(String[] args) {

		// create scanner class object
		Scanner input = new Scanner(System.in);

		// Event Organizer details
		System.out.print("Enter Organizer Name: ");
		String name = input.nextLine();

		System.out.print("Enter Organizer Email: ");
		String email = input.nextLine();

		// insert organizer details
		User organizer = new User(name, email);

		// Event details
		System.out.print("Enter Event ID: ");
		int eventId = input.nextInt();
		input.nextLine();

		System.out.print("Enter Event Name: ");
		String eventName = input.nextLine();

		System.out.print("Enter Location: ");
		String location = input.nextLine();

		System.out.print("Enter Date: ");
		String date = input.nextLine();

		System.out.print("Enter Number of Attendees: ");
		int attendees = input.nextInt();

		System.out.print("Enter Venue Cost: ");
		double venueCost = input.nextDouble();

		System.out.println("Choose Event Type:");
		System.out.println("1. Birthday Event");
		System.out.println("2. Conference Event");
		int choice = input.nextInt();

		Event event = null;

		if (choice == 1) {
			System.out.print("Enter Service Cost (Catering + Decoration): ");
			double serviceCost = input.nextDouble();

			System.out.print("Enter Discount: ");
			double discount = input.nextDouble();

			event = new BirthdayEvent(eventId, eventName, location, date, attendees, venueCost, serviceCost, discount,
					organizer);

		} else if (choice == 2) {

			event = new ConferenceEvent(eventId, eventName, location, date, attendees, venueCost, organizer);
		}

		// -------- EVENT ACTION MENU --------
		if (event != null) {
			System.out.println("\nChoose Action: ");
			System.out.println("1. Schedule Event");
			System.out.println("2. Reschedule Event");
			System.out.println("3. Cancel Event");

			int action = input.nextInt();
			input.nextLine();

			switch (action) {
			case 1:
				event.schedule();
				System.out.println("Total Cost: rs." + event.calculateTotalCost());
				break;

			case 2:
				System.out.print("Enter New Date: ");
				String newDate = input.nextLine();
				event.reschedule(newDate);
				break;

			case 3:
				event.cancel();
				break;

			default:
				System.out.println("Invalid choice!");
			}
		}

		input.close();
	}
}
