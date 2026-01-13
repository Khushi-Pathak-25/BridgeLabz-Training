package com.daytwo.trafficmanager;

public class VehicleCircularLinkedList {

	private VehicleNode head = null;
	private VehicleNode tail = null;

	// add vehicle
	public void addVehicle(int numberOfVehicle) {

		VehicleNode newNode = new VehicleNode(numberOfVehicle);

		if (head == null) {
			head = tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}

		System.out.println("Vehicle Number " + numberOfVehicle + " Entered.");
	}

	// Remove vehicle
	public void removeVehicle() {

		if (head == null) {
			System.out.println("Roundabout Empty !");
			return;
		}
		if (head == tail) {
			System.out.println("Car " + head.numOfVehicle + " Exited.");
			head = tail = null;
		} else {
			System.out.println("Car " + head.numOfVehicle + " Exited.");
			head = head.next;
			tail.next = head;
		}
	}
	
	// Display
	public void display() {

		if (head == null) {
			System.out.println("Roundabout Empty !");
		}
		VehicleNode temp = head;
		System.out.print("Roundabout: ");
		do {
			System.out.print(temp.numOfVehicle +" ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

}
