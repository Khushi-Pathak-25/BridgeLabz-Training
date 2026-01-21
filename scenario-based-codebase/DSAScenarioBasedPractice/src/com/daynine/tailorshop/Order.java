package com.daynine.tailorshop;

import java.time.LocalDate;

public class Order {

	protected String orderName;
	protected LocalDate deliverydate;

	public Order(String orderName, LocalDate deliverydate) {
		this.orderName = orderName;
		this.deliverydate = deliverydate;
	}

	@Override
	public String toString() {
		return "Order Name: " + orderName + ", Delivery Date: " + deliverydate;
	}
}
