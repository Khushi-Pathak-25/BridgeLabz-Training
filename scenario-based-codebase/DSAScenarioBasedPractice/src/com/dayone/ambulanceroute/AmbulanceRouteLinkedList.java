package com.dayone.ambulanceroute;

public class AmbulanceRouteLinkedList {
	
	private UnitNode head;
	
	// add unit in circular list
	public void addUnit(String name, boolean isAvailable) {
		
		UnitNode newNode = new UnitNode(name, isAvailable);
		
		if(head == null) {		
			head = newNode;
			newNode.next = head;
			return;
			
		}
		UnitNode temp = head;
		while(temp.next!=head) {
			temp= temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
	}
	
	// find nearest available unit
	
	public void findAvailableUnit() {
		if(head == null) {
			System.out.println("No Available Unit");
			return;
		}
		
		UnitNode temp = head;
		do {
			System.out.println("Checking :"+temp.name);
			if(temp.isAvailable) {
				System.out.println("Patient admitted to:"+temp.name);
				return;
			}
			temp = temp.next;
		} 
		while(head != null);
		System.out.println("No unit available, redirect patient");	
	}
	
	// remove unit under maintenance
	public void removeUnit(String name) {
		if(head == null ) return;
		
		UnitNode current = head;
		UnitNode previous = null;
		
		do {
			if(current.name.equals(name)) {
				
				// check for only one unit
				
				if(current.next == head && previous == null) {
					head = null;
					return;
				}
				
				// removing head
				if(current == head) {
					UnitNode last = head;
					while(last.next != head) {
						last = last.next;	
					}
					head = head.next;
					last.next = head;
				}
				else {
                    previous.next = current.next;
                }
                return;
			}
			
			previous = current;
			current = current.next;
		}
		while(current != head);
	}
	
}
