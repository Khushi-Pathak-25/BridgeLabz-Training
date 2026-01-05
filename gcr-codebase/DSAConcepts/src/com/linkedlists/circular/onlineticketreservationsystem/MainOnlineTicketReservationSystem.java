/*9. Circular Linked List: Online Ticket Reservation System
Problem Statement: Design an online ticket reservation system using a circular linked list, 
where each node represents a booked ticket. Each node will store the following information: 
Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.
Hint:
Use a circular linked list to represent the ticket reservations, 
with the last node’s next pointer pointing to the first node.
When removing a ticket, update the circular pointers accordingly.
For displaying all tickets, traverse the list starting from the first node, 
looping back after reaching the last node.*/

package com.linkedlists.circular.onlineticketreservationsystem;

public class MainOnlineTicketReservationSystem {

	public static void main(String[] args) {

		TicketCircularLinkedList tickets = new TicketCircularLinkedList();

		tickets.addTicket(1, "Khushi", "Avatar: Fire and Ash", "K10", "11:30 AM");
		tickets.addTicket(2, "Shagun", "Dhurandar", "S10", "10:00 AM");
		tickets.addTicket(3, "Richa", "Anaconda", "R11", "10:30 AM");

		System.out.println("All Tickets:");
		tickets.displayTickets();

		System.out.println("Search by Movie Name (Fighter):");
		tickets.searchTicket("Fighter");

		System.out.println("Remove Ticket ID 2:");
		tickets.removeTicket(2);

		System.out.println("---------------------------");
		System.out.println("Updated Tickets:");
		tickets.displayTickets();

		System.out.println("Total Tickets Booked: " + tickets.getTotalTickets());
	}
}