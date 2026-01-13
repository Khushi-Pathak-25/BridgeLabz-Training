/*5. TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.*/

package com.daytwo.traincompanion;

public class MainTrainCompanion {

	// Main method
    public static void main(String[] args) {

        CompartmentDoublyLinkedList train = new CompartmentDoublyLinkedList();

        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC");
        train.addCompartment("WiFi");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacentCompartments("AC");

        train.removeCompartment("Pantry");
        train.traverseForward();
    }
}

