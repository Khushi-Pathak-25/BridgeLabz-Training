/*3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.*/

package com.encapsulationpolymorphism.vehiclerentalsystem;

import java.util.*;

public class MainVehicleRentalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nVehicle " + i);
            sc.nextLine(); // clear buffer

            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();

            System.out.print("Enter Rental Rate per day: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Insurance Policy Number: ");
            String policy = sc.nextLine();

            System.out.print("Vehicle Type (1-Car, 2-Bike, 3-Truck): ");
            int type = sc.nextInt();

            Vehicle v;

            if (type == 1) {
                v = new Car(number, rate, policy);
            } else if (type == 2) {
                v = new Bike(number, rate, policy);
            } else {
                v = new Truck(number, rate, policy);
            }

            vehicles.add(v);
        }

        System.out.print("\nEnter number of rental days: ");
        int days = sc.nextInt();

        // Polymorphism demonstration
        for (Vehicle v : vehicles) {

            v.displayVehicleInfo();

            double rent = v.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: " + rent);

            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost: " + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());

            System.out.println("---------------------------");
        }

        sc.close();
    }
}
