package com.daytwo.traincompanion;

public class CompartmentDoublyLinkedList {
	
	private CompartmentNode head;
	private CompartmentNode tail;
	
	// add compartment
	public void addCompartment(String name) {
		CompartmentNode newNode = new CompartmentNode(name);
		
		if(head == null) {
			head = tail = newNode;
		}
		else {
		    tail.next = newNode;
		    newNode.prev = tail;
		    tail = newNode;
		}
		
	}
	
	// Traverse forward
	public void traverseForward() {
		
		CompartmentNode temp = head;
		System.out.println("Traverse Forward in Compartment: ");
		
		while(temp != null) {
			System.out.print(temp.name + " ");
			temp = temp.next;
		}
		System.out.println("\n--------------------------------------------");
	}

	// Traverse backward
	public void traverseBackward() {
		
		CompartmentNode temp = tail;
		System.out.println("Traverse Backward in Compartment: ");
		
		while(temp != null) {
			System.out.print(temp.name + " ");
			temp = temp.prev;
			
		}
		System.out.println("\n--------------------------------------------");
	}
	
	// Remove Compartment
	public void removeCompartment(String name) {
		
		CompartmentNode temp = head;
		
		while(temp != null) {
			if(temp.name.equals(name)) {
				if(temp == head) {
					head = head.next;	
					if(head != null) {
						head.prev = null;
					}
				}	
				else if(temp == tail) {
					tail = tail.prev;
					tail.next = null;
				}
				else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}
				
				System.out.println(name +" Compartment Removed !");
				System.out.println("--------------------------------------------");
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Compartment not found !");
	}
	
	// show adjacent compartment
	public void showAdjacentCompartments(String name) {
		CompartmentNode temp = head;
		
		while(temp != null) {
			
			if(temp.name.equals(name)) {
				
				System.out.println("Current Compartment: "+temp.name);
				System.out.println("Previous Compartment: "+ (temp.prev!=null ? temp.prev.name :"null "));
				System.out.println("Next Compartment: "+ (temp.next != null ? temp.next.name : "null"));
				
				System.out.println("--------------------------------------------");
				return;
				
			}
			temp = temp.next;
			
		}
		System.out.println("Compartment not found !");
		
	}
	
}