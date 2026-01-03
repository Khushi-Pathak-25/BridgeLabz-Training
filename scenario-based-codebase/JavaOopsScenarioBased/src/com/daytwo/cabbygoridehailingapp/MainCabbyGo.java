/*6. "CabbyGo – A Ride-Hailing App in the Making"
Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
the backend logic for managing vehicles, drivers, and ride booking.
Requirements:
● Vehicle (class): fields like vehicleNumber, capacity, type.
● Driver (class): fields like name, licenseNumber, rating.
● Constructors to initialize vehicles and drivers.
● An IRideService interface with methods like bookRide() and endRide().
● Use encapsulation to hide sensitive data like location, fare.
● Implement polymorphism with different vehicle types like Mini, Sedan, SUV (all extend
Vehicle).

● Use operators to calculate fare: baseFare + distance * rate.
● Apply access modifiers carefully: private for rating and fare, public methods to
read data.*/

package com.daytwo.cabbygoridehailingapp;

import java.util.Scanner;

public class MainCabbyGo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
		// Driver input
		System.out.print("Enter Driver Name: ");
		String driverName = input.nextLine();

		System.out.print("Enter License Number: ");
		String license = input.nextLine();

		System.out.print("Enter Driver Rating: ");
		double rating = input.nextDouble();
		// for buffer clear
		input.nextLine();

		Driver driver = new Driver(driverName, license, rating);
		
		// Vehicle class reference
		Vehicle vehicle;
			System.out.println("Choose Vehicle Type: ");
			System.out.println("Enter 1 for Mini");
			System.out.println("Enter 2 for Sedan");
			System.out.println("Enter 3 for SUV");
			System.out.println("Enter 4 for Exit");
			System.out.print("Enter your choice: ");

			int userChoice = input.nextInt();
			input.nextLine(); // buffer clear
			
			if (userChoice == 4) {
                System.out.println("Thank you for using CabbyGo!");
                break;
            }
            
			// Vehicle input
			System.out.print("Enter Vehicle Number: ");
			String vehicleNumber = input.nextLine();

			if (userChoice == 1) {
				vehicle = new Mini(vehicleNumber);
			} else if (userChoice == 2) {
				vehicle = new Sedan(vehicleNumber);
			} else if (userChoice == 3) {
				vehicle = new SUV(vehicleNumber);
			}		
			else {
				System.out.println("Please Enter Valid Choice");
				continue;
			}
			// Distance input
			System.out.print("Enter Distance (in km): ");
			double distance = input.nextDouble();
			input.nextLine(); // buffer clear
			
			// Ride service
			IRideService rideService = new RideService();
			rideService.bookRide(vehicle, driver, distance);
			rideService.endRide();
			System.out.println("-----------------------------------");
		}
		
		input.close();

	}

}
