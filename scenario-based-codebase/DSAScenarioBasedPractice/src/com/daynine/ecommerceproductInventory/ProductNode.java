package com.daynine.ecommerceproductInventory;

public class ProductNode {

	protected int sku;
	protected double price;
	protected ProductNode left, right;

	ProductNode(int sku, double price) {
		this.sku = sku;
		this.price = price;
		left = right = null;
	}
}
