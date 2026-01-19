/*1. Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, 
Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining 
type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
*/

package com.generics.smartwarehouse;

public class SmartWarehouseApp {

	public static void main(String[] args) {

		Storage<Electronics> electronicsStorage = new Storage<>();
		electronicsStorage.addItem(new Electronics("Laptop", 80000));

		Storage<Groceries> groceryStorage = new Storage<>();
		groceryStorage.addItem(new Groceries("Rice", 1500));

		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.addItem(new Furniture("Chair", 5000));

		System.out.println("---- Electronics ----");
		WarehouseUtil.displayAllItems(electronicsStorage.getItems());

		System.out.println("---- Groceries ----");
		WarehouseUtil.displayAllItems(groceryStorage.getItems());

		System.out.println("---- Furniture ----");
		WarehouseUtil.displayAllItems(furnitureStorage.getItems());
	}
}
