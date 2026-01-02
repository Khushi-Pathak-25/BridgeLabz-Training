/*Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and 
Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface 
that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, 
each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, 
giving multiple behaviors to the same objects.*/

package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class MainRestaurantManagementSystem {

	public static void main(String[] args) {

        // Hybrid inheritance demonstration
        Worker worker1 = new Chef("Ramu kaka", 111, "Italian");
        Worker worker2 = new Waiter("Chhotu", 112, 10);

        worker1.performDuties();
        System.out.println("--------------------------");

        worker2.performDuties();
    }
}
