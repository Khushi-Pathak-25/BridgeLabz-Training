package com.interfaces.defaultmethods.smartvehicle;

import java.util.Scanner;

public class SmartVehicleDashboardApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sample vehicles
        Vehicle petrolCar = new PetrolCar("Maruti Swift", 85);
        Vehicle electricScooter = new ElectricScooter("Ola S1 Pro", 45, 72);
        Vehicle electricCar = new ElectricCar("Tata Nexon EV", 60, 18);

        System.out.println("Smart Vehicle Dashboard Demo");
        System.out.println("1 - Petrol Car (no battery info)");
        System.out.println("2 - Electric Scooter");
        System.out.println("3 - Electric Car");
        System.out.print("Select vehicle to view dashboard (1-3): ");

        int choice = input.nextInt();

        Vehicle selectedVehicle;

        if (choice == 1) {
            selectedVehicle = petrolCar;
        } else if (choice == 2) {
            selectedVehicle = electricScooter;
        } else if (choice == 3) {
            selectedVehicle = electricCar;
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        System.out.println("\nDashboard reading:");
        selectedVehicle.displaySpeed();
        selectedVehicle.displayBatteryPercentage();

        input.close();
    }
}