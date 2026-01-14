/*10. ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).
*/
package com.daythree.parceltracker;

public class MainParcelTracker {

	    public static void main(String[] args) {

	        ParcelTrackerSinglyLinkedList tracker = new ParcelTrackerSinglyLinkedList();

	        // Initial stages
	        tracker.addStage("Packed");
	        tracker.addStage("Shipped");
	        tracker.addStage("In Transit");
	        tracker.addStage("Delivered");

	        tracker.display();
	        // Add custom checkpoint
	        tracker.addAfter("Shipped", "Customs Check");

	        // Track parcel
	        tracker.display();
	    }
}
