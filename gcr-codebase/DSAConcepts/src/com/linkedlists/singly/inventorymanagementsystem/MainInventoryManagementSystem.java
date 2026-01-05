/*4. Singly Linked List: Inventory Management System
Problem Statement: Design an inventory management system using a singly linked list where each node stores 
information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
Add an item at the beginning, end, or at a specific position.
Remove an item based on Item ID.
Update the quantity of an item by Item ID.
Search for an item based on Item ID or Item Name.
Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
Sort the inventory based on Item Name or Price in ascending or descending order.
Hint:
Use a singly linked list where each node represents an item in the inventory.
Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
For total value calculation, traverse through the list and sum up Quantity * Price for each item.*/

package com.linkedlists.singly.inventorymanagementsystem;

public class MainInventoryManagementSystem {

    public static void main(String[] args) {

        InventorySinglyLinkedList inventory = new InventorySinglyLinkedList();

        inventory.addFirst( "Keyboard", 111,10, 1000);
        inventory.addEnd( "Mouse",112, 20, 500);
        inventory.addEnd( "Monitor",113, 5, 15000);
        inventory.addFirst( "Laptop",114, 3, 80000);

        inventory.addAtPosition(2,"Webcam",115,  7, 2500);

        System.out.println("All Inventory:");
        inventory.displayAll();

        System.out.println("Search by Item ID 112:");
        inventory.searchByItemId(112);

        System.out.println("Update Quantity (Monitor):");
        inventory.updateQuantity(113, 10);
        inventory.displayTotalInventoryValue();

        System.out.println("Sort by Name (ASC):");
        inventory.sortByName(true);
        inventory.displayAll();

        System.out.println("Sort by Price (DESC):");
        inventory.sortByPrice(false);
        inventory.displayAll();

        System.out.println("Remove Item ID 111:");
        inventory.removeByID(111);
        inventory.displayAll();
    }
}

