package com.daythree.parceltracker;

public class ParcelTrackerSinglyLinkedList {

	private StageNode head;

	// Add stage at end
	public void addStage(String stageName) {

		StageNode newNode = new StageNode(stageName);

		// Case 1: Empty list
		if (head == null) {
			head = newNode;
			return;
		}

		// Case 2: Non-empty list
		StageNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	// Add stage after a specific stage
	public void addAfter(String existingStage, String newStage) {

		StageNode temp = head;

		if (temp != null && !temp.stageName.equals(newStage)) {

			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Stage not found: " + existingStage);
			return;
		}

		StageNode newNode = new StageNode(newStage);

		newNode.next = temp.next;
		temp.next = newNode;
	}

	// display parcel journey
	public void display() {
		if (head == null) {
			System.out.println("Parcel is lost");
			return;
		}
		StageNode temp = head;
		 while (temp != null) {
		        System.out.print(temp.stageName);

		        if (temp.next != null) {
		            System.out.print(" -> ");
		        }

		        temp = temp.next;
		    }

		    System.out.println();
	}
	

}
