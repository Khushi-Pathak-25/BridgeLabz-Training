package com.daythree.smartcheckout;

import java.util.HashMap;
public class SmartCheckout {
	
	public static CustomerQueue queue = new CustomerQueue();
	public static HashMap<String, Item> itemMap = new HashMap<>();
	
	public static void processBilling() {
		
		if(queue.isEmpty()) {
			System.out.println("No customer in queue");
			return;
		}
		
		Customer customer =queue.dequeue();
		int total = 0;
		
		System.out.println("\nBilling Customer: "+customer.name);
		
		for(String itemName : customer.items) {
			
			Item item = itemMap.get(itemName);
			
			if(item != null && item.stock>0) {
				total += item.price;
				item.stock--;
				
				System.out.println("Item "+itemName + " purchased for Rs. "+ item.price);
			}
			
			else {
				 System.out.println(itemName + " is out of stock");
			}
		}
		   System.out.println("Total Bill = Rs." + total);
	}

}
