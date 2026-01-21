/*Story: E-Commerce Product Inventory
An online store categorizes products by SKU numbers.
Scenarios:
● 🔹 Scenario 1: Lookup — Customers search for a product using SKU.
● 🔹 Scenario 2: Price Update — Admin updates products using SKU key.
● 🔹 Scenario 3: Sorted List — Display all products in sorted SKU order.*/

package com.daynine.ecommerceproductInventory;

public class ECommerceProductInventory {

	public static void main(String[] args) {

		ProductBST bst = new ProductBST();

		bst.root = bst.insert(bst.root, 1005, 499.99);
		bst.insert(bst.root, 1002, 299.99);
		bst.insert(bst.root, 1008, 799.99);
		bst.insert(bst.root, 1001, 199.99);

		System.out.println("Sorted Product List:");
		bst.inorder(bst.root);

		ProductNode p = bst.search(bst.root, 1002);
		if (p != null)
			p.price = 349.99; // price update
	}

}
