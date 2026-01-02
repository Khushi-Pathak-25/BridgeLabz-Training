/*Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and 
ElectricVehicle and PetrolVehicle are subclasses. Additionally, 
create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, 
while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, 
demonstrating how Java interfaces allow adding multiple behaviors.*/

package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class MainVehicleManagementSystem {

    public static void main(String[] args) {

        // Hybrid inheritance demonstration
        Vehicle ev = new ElectricVehicle("Tesla Model", 300, 80);
        Vehicle pv = new PetrolVehicle("Honda", 180, 40);

        ev.displayInfo();
        ((ElectricVehicle)ev).charge();
        System.out.println("---------------------");

        pv.displayInfo();
        ((PetrolVehicle) pv).refuel();
    }
}
