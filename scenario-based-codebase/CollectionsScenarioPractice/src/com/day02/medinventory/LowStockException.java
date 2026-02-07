package com.day02.medinventory;

// custom exception for low stock
public class LowStockException extends Exception {
	private static final long serialVersionUID = 1L;

	public LowStockException(String message) {
		super(message);
	}
}