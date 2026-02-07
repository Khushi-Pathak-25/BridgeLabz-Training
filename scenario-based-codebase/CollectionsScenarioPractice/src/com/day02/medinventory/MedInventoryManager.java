package com.day02.medinventory;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;

public class MedInventoryManager {
	// category (item name) -> list of items
	private Map<String, List<Item>> itemsByCategory;
	
	// unique items by ID
	private Set<Item> uniqueItems;

	// constructor
	public MedInventoryManager() {
		itemsByCategory = new HashMap<>();
		uniqueItems = new HashSet<>();
	}

	// load inventory from CSV
	public void loadInventory(String filePath) throws IOException, LowStockException {
		// regex: ItemID,ItemName,Quantity,dd-MM-yyyy
		Pattern valid = Pattern.compile("^[^,]+,[^,]+,\\d+,\\d{2}-\\d{2}-\\d{4}$");

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int lineNum = 0;

			while ((line = br.readLine()) != null) {
				line = line.trim();
				lineNum++;

				if (line.isEmpty() || line.startsWith("ItemID"))
					continue;

				Matcher m = valid.matcher(line);
				if (!m.matches()) {
					System.out.println("Invalid line " + lineNum + ": " + line);
					continue;
				}

				String[] parts = line.split(",");
				String id = parts[0].trim();
				String name = parts[1].trim();
				int qty = Integer.parseInt(parts[2].trim());
				String exp = parts[3].trim();

				// create Item with given details
				Item item = new Item(id, name, qty, exp);

				// skip duplicate ID
				if (!uniqueItems.add(item)) {
					System.out.println("Duplicate ID skipped: " + id);
					continue;
				}

				// group by item name (category)
				itemsByCategory.computeIfAbsent(name, k -> new ArrayList<>()).add(item);

				// check low stock
				if (item.isLowStock()) {
					throw new LowStockException("Low stock: " + name + " (ID: " + id + ", Qty: " + qty + ")");
				}
			}
		}
	}

	// show expired items
	public void showExpiredItems() {
		LocalDate today = LocalDate.of(2026, 1, 26);

		System.out.println("Expired Items (as of " + today + "):");
		boolean found = false;

		for (List<Item> list : itemsByCategory.values()) {
			for (Item item : list) {
				if (item.isExpired(today)) {
					System.out.println(item);
					found = true;
				}
			}
		}

		if (!found)
			System.out.println("No expired items.");
	}

	// show summary by category
	public void showSummary() {
		System.out.println("\nInventory Summary:");
		System.out.println("--------------------------------------------------------------");

		for (Map.Entry<String, List<Item>> entry : itemsByCategory.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().size() + " items");
		}

		System.out.println("--------------------------------------------------------------");
		System.out.println("Total unique items: " + uniqueItems.size());
	}
}