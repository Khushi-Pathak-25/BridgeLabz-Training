package com.daynine.ecommerceproductInventory;

public class ProductBST {

	ProductNode root;

	// Insert Product
	ProductNode insert(ProductNode root, int sku, double price) {
		if (root == null)
			return new ProductNode(sku, price);

		if (sku < root.sku)
			root.left = insert(root.left, sku, price);
		else if (sku > root.sku)
			root.right = insert(root.right, sku, price);

		return root;
	}

	// Search Product
	ProductNode search(ProductNode root, int sku) {
		if (root == null || root.sku == sku)
			return root;

		if (sku < root.sku)
			return search(root.left, sku);
		else
			return search(root.right, sku);
	}

	// Inorder Traversal (Sorted SKUs)
	void inorder(ProductNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.println("SKU: " + root.sku + " Price: " + root.price);
			inorder(root.right);
		}
	}
}
