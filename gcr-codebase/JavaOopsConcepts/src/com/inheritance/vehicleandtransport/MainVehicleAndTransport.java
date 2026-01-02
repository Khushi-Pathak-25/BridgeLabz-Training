/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, 
and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and
calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and
use polymorphism for dynamic method calls.*/

package com.inheritance.vehicleandtransport;

public class MainVehicleAndTransport {

    public static void main(String[] args) {

        // Polymorphism- Vehicle array holding different subclasses objects
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(150, "Petrol", 5);
        vehicles[1] = new Truck(140, "Diesel");
        vehicles[2] = new MotorCycle(120, "Petrol");

        // Loop to demonstrate dynamic method dispatch
        for (Vehicle vehicle : vehicles) {
            System.out.println("--------------------");
            vehicle.displayInfo();
        }
    }
}