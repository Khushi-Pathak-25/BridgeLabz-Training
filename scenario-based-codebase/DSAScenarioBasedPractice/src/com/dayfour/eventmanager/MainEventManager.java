/*4. EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets*/

package com.dayfour.eventmanager;

public class MainEventManager {

	public static void main(String[] args) {

		// ticket array
		Ticket[] tickets = { new Ticket(1500), new Ticket(500), new Ticket(2500), new Ticket(800), new Ticket(1200) };

		QuickSortTickets.quickSort(tickets, 0, tickets.length - 1);

		System.out.println("Sorted Ticket Prices:");
		// display sorted tickets
		for (Ticket t : tickets) {
			t.display();
		}
	}
}
