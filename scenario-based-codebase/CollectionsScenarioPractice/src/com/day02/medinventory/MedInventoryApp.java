/*
6. MedInventory – Smart Hospital Inventory Tracker
Story: At Apollo International Hospital, a new system called MedInventory is being built to track
medical supplies such as gloves, syringes, and oxygen cylinders.
Every morning, the inventory data is dumped as a .csv file containing:
ItemID,ItemName,Quantity,ExpiryDate
The Java system must:
● Read inventory files using BufferedReader (I/O Streams)
● Detect expired items using Regex on the ExpiryDate field (dd-MM-yyyy)
● Categorize items by type using Map<String, List<Item>>
● Remove duplicates using Set<Item> based on item ID
● Use Generics to allow extension to surgical tools, medicines, etc.
● Raise custom exceptions for critically low supplies

*/

package com.day02.medinventory;

import java.io.IOException;

public class MedInventoryApp {
	public static void main(String[] args) {
		MedInventoryManager manager = new MedInventoryManager();

		// file location
		String csvFile = "samplefiles/inventory.csv";

		try {
			manager.loadInventory(csvFile);
			manager.showExpiredItems();
			manager.showSummary();
			
		} catch (LowStockException e) {
			
			System.out.println("CRITICAL ALERT: " + e.getMessage());
		} catch (IOException e) {
			
			System.out.println("File error: " + e.getMessage());
		} catch (Exception e) {
			
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}
}