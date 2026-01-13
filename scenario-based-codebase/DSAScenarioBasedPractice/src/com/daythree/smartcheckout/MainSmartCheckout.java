/*9. SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.*/

package com.daythree.smartcheckout;

import java.util.HashMap;
public class MainSmartCheckout {
	
	public static void main (String[]args) {
		
		// Add items to store (HashMap)
		SmartCheckout.itemMap.put("Milk",new Item("Milk", 70, 1));
		SmartCheckout.itemMap.put("Bread",new Item("Bread",50, 2));
		SmartCheckout.itemMap.put("Candy",new Item("Candy", 20, 1));
		
		// Add customer
		Customer c1 = new Customer("Khushi",new String[] {"Milk","Bread"});
		Customer c2 = new Customer("Shagun",new String[] {"Bread","Candy"});
		Customer c3 = new Customer("Pawan",new String[] {"Milk","Candy"});
		
		System.out.println("--------   Welocome to SmartCheckout  -----------");
		
		// add customer to queue
		SmartCheckout.queue.enqueue(c1);
		SmartCheckout.queue.enqueue(c2);
		SmartCheckout.queue.enqueue(c3);
		SmartCheckout.queue.dequeue();
		
		// process billing of customer
		SmartCheckout.processBilling();
		System.out.println("---------------------------------------");
		SmartCheckout.processBilling();
		System.out.println("---------------------------------------");
		SmartCheckout.processBilling();	
		
	}

}

