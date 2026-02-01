package com.interfaces.basic.vehiclerental;

import java.util.Scanner;

public class VehicleRentalApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sample vehicles
        Rentable sedan = new Car("Honda City", 120.0);
        Rentable bike = new Bike("Royal Enfield", 50.0);
        Rentable sleeperBus = new Bus("Volvo Sleeper", 300.0);

        System.out.println("Multi-Vehicle Rental System");
        System.out.println("1 - Rent a Car");
        System.out.println("2 - Rent a Bike");
        System.out.println("3 - Rent a Bus");
        System.out.print("Choose vehicle type (1-3): ");

        int choice = input.nextInt();
        System.out.print("Enter rental hours: ");
        int hours = input.nextInt();

        Rentable selectedVehicle;

        if (choice == 1) {
            selectedVehicle = sedan;
        } else if (choice == 2) {
            selectedVehicle = bike;
        } else if (choice == 3) {
            selectedVehicle = sleeperBus;
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        System.out.println("\nRenting vehicle...");
        selectedVehicle.rent(hours);

        System.out.print("\nPress 1 to return the vehicle now (any other key to skip): ");
        int returnChoice = input.nextInt();

        if (returnChoice == 1) {
            System.out.println("Returning vehicle...");
            selectedVehicle.returnVehicle();
        } 
        else {
            System.out.println("Vehicle remains rented.");
        }

        input.close();
    }
}