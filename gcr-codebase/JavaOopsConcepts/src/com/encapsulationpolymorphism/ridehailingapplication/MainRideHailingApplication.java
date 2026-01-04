/*8. Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.*/

package com.encapsulationpolymorphism.ridehailingapplication;

import java.util.*;

public class MainRideHailingApplication {
	
	 // Polymorphic method to calculate fare
    public static void calculateRideFare(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: " + v.calculateFare(distance));
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nVehicle " + i);
            System.out.print("Enter Vehicle ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Driver Name: ");
            String driver = sc.nextLine();

            System.out.print("Enter Rate per Km: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Current Location: ");
            String location = sc.nextLine();

            System.out.print("Vehicle Type (1-Car, 2-Bike, 3-Auto): ");
            int type = sc.nextInt();

            Vehicle v;

            if (type == 1) {
                v = new Car(id, driver, rate, location);
            } else if (type == 2) {
                v = new Bike(id, driver, rate, location);
            } else {
                v = new Auto(id, driver, rate, location);
            }

            vehicles.add(v);
        }

        System.out.print("\nEnter Ride Distance (in km): ");
        double distance = sc.nextDouble();

        calculateRideFare(vehicles, distance);
        sc.close();
    }
}
