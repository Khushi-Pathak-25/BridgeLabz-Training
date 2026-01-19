/*2. Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, 
Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
*/

package com.generics.onlinemarketplace;

public class OnlineMarketplaceApp {

	public static void main(String[] args) {

		Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory());

		Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1200, new ClothingCategory());

		Product<GadgetCategory> phone = new Product<>("Smartphone", 25000, new GadgetCategory());

		DiscountUtil.applyDiscount(book, 10);
		DiscountUtil.applyDiscount(shirt, 20);
		DiscountUtil.applyDiscount(phone, 5);

		book.displayProduct();
		shirt.displayProduct();
		phone.displayProduct();
	}
}
