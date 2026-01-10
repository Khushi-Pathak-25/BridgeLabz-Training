package com.dayone.browserbuddy;

public class Tab {

	private HistoryNode head;
	private HistoryNode current;
	
	// open first page
	Tab (String homepage){
		head = new HistoryNode(homepage);
		current = head;
		System.out.println("\n=====================");
		System.out.println("Opened: "+homepage);
		System.out.println("=====================");
	}
	
	// visit new page
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);
		
		current.next = newNode;
		newNode.prev = current;
		
		current = newNode;
		System.out.println("Visited: "+url);
		System.out.println("--------------------");
		
		
	}
	
	// Back Operations
	public void back() {
		if(current.prev != null) {
			current = current.prev;
			System.out.println("Back To: "+current.url);
			System.out.println("----------------------");
		}
		else {
			System.out.println("No Previous Page");
			System.out.println("-----------------------");
		}
	}
	
	// Forward Operation
	public void forward() {
		if(current.next != null) {
			current= current.next;
			System.out.println("Forward To: "+current.url);
			System.out.println("-------------------------");
		}
		else {
			System.out.println("No Next Page");
			System.out.println("-------------------------");
		}
	}

	// display current page
	public void displayCurrentPage() {
		System.out.println("Current Page: "+current.url);
	}
}
