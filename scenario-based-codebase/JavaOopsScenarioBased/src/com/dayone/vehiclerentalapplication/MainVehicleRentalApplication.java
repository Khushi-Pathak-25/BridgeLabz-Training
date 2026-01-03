/*2. Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer

Scenario-based Problems
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
● OOP:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters*/

package com.dayone.vehiclerentalapplication;

public class MainVehicleRentalApplication {

	public static void main(String[] args) {

		Customer customer = new Customer(111, "Khushi Pathak");

		Vehicle bike = new Bike("MP09-CA43");
		Vehicle car = new Car("MP09- CA275");
		Vehicle truck = new Truck("MP09-CA5454");

		int days = 5;

		customer.displayCustomer();
		System.out.println("----------------");

		bike.displayDetails();
		System.out.println("Rent for " + days + " days : Rs." + bike.calculateRent(days));
		System.out.println("----------------");

		car.displayDetails();
		System.out.println("Rent for " + days + " days : Rs." + car.calculateRent(days));
		System.out.println("----------------");

		truck.displayDetails();
		System.out.println("Rent for " + days + " days : Rs." + truck.calculateRent(days));
	}
}