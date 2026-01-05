package com.linkedlists.singly.inventorymanagementsystem;

public class ItemNode {
	
	// Item Name, Item ID, Quantity, and Price
	String itemName;
	int itemID;
	int quantity;
	double price;
	
	ItemNode next;
	
	public ItemNode(String itemName, int itemID, int quantity, double price) {
		this.itemName = itemName;
		this.itemID = itemID;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
	
}
