/*16. "ParkEase – Smart Parking Management System"
Story: A city wants a smart parking solution that can assign parking slots, calculate charges,
and track availability in real time.
Requirements:
● ParkingSlot class: slotId, isOccupied, vehicleTypeAllowed.
● Vehicle base class → Car, Bike, Truck subclasses.
● IPayable interface with calculateCharges(duration) method.
● Encapsulation: Slot availability shouldn't be altered externally.
● Use constructors for slot initialization with location, vehicle type.
● Operators: (baseRate × hours) + (penalty if over time).
● Polymorphism: calculateCharges() differs by vehicle type.
● Access Modifiers: internal booking records are private, exposed via logs.*/

package com.dayfive.parkease;

import java.util.Scanner;

public class ParkEaseSmartParkingManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // SLOT INITIALIZATION-
        ParkingSlot slot = new ParkingSlot(101, "Block E", "Car");

        ParkingManager manager = new ParkingManager();

        //  VEHICLE INPUT
        System.out.println("Enter Vehicle Type (Car / Bike / Truck):");
        String type = sc.nextLine();

        System.out.println("Enter Vehicle Number:");
        String vehicleNumber = sc.nextLine();

        Vehicle vehicle = null;

        //  VEHICLE OBJECT CREATION 
        if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car(vehicleNumber);
        } else if (type.equalsIgnoreCase("Bike")) {
            vehicle = new Bike(vehicleNumber);
        } else if (type.equalsIgnoreCase("Truck")) {
            vehicle = new Truck(vehicleNumber);
        } else {
            System.out.println("Invalid Vehicle Type!");
            sc.close();
            return;
        }

        //  PARKING DURATION INPUT 
        System.out.println("Enter Parking Duration (in hours):");
        int hours = sc.nextInt();

        // SLOT BOOKING
        if (slot.isAvailable()) {
            slot.bookSlot();

            double totalCharge = vehicle.calculateCharges(hours);

            System.out.println("\n--- Parking Details ---");
            System.out.println(slot.getSlotInfo());
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Total Charges: Rs." + totalCharge);

            manager.addLog(type + " | " + vehicleNumber +
                           " | Slot 101 | Charge: Rs." + totalCharge);
        } else {
            System.out.println("Parking Slot Not Available!");
        }

        // LOG DISPLAY
        System.out.println();
        manager.showLogs();

        sc.close();
    }
}

