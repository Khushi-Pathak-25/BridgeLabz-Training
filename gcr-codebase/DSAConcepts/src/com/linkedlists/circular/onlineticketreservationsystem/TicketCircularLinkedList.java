package com.linkedlists.circular.onlineticketreservationsystem;

public class TicketCircularLinkedList {

	private TicketNode head;
	private TicketNode tail;
	private int count = 0;

	// Adds a new ticket at last
	public void addTicket(int id, String customer, String movie, String seat, String time) {
		TicketNode node = new TicketNode(id, customer, movie, seat, time);

		if (head == null) {
			head = tail = node;
			node.next = node;
			count++;
			return;
		}

		node.next = head;
		tail.next = node;
		tail = node;
		count++;
	}

	// Removes a ticket using ticket ID
	public void removeTicket(int id) {

		if (head == null) {
			System.out.println("No tickets available.");
			return;
		}

		TicketNode current = head;
		TicketNode prev = tail;

		// Traverse circular list to find ticket
		do {
			if (current.ticketId == id) {

				if (current == head && current == tail) {
					head = tail = null;
				} else {
					prev.next = current.next;
					if (current == head)
						head = current.next;
					if (current == tail)
						tail = prev;
				}
				count--;
				System.out.println("Ticket removed.");
				return;
			}

			prev = current;
			current = current.next;

		} while (current != head);

		System.out.println("Ticket not found.");
	}

	// Displays all booked tickets
	public void displayTickets() {

		if (head == null) {
			System.out.println("No tickets booked.");
			return;
		}

		TicketNode temp = head;

		// Traverse until back to head
		do {
			displayTicket(temp);
			temp = temp.next;
		} while (temp != head);
	}

	// Searches ticket by customer name or movie name
	public void searchTicket(String keyword) {

		if (head == null) {
			System.out.println("No tickets available.");
			return;
		}

		boolean found = false;
		TicketNode temp = head;

		// Traverse entire circular list
		do {
			if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
				displayTicket(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No matching ticket found.");
		}
	}

	// Returns total number of booked tickets
	public int getTotalTickets() {
		return count;
	}

	// Displays single ticket details
	private void displayTicket(TicketNode node) {
		System.out.println("Ticket ID     : " + node.ticketId);
		System.out.println("Customer Name : " + node.customerName);
		System.out.println("Movie Name    : " + node.movieName);
		System.out.println("Seat Number   : " + node.seatNumber);
		System.out.println("Booking Time  : " + node.bookingTime);
		System.out.println("-----------------------------");
	}
}
