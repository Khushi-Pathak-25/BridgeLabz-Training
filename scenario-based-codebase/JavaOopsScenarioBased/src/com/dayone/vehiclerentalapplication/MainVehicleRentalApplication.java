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