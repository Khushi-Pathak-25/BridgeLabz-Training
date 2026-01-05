package com.daythree.thegroceryshoppingapp;

public interface ICheckout {
	
	void generateBill();
    double applyDiscount(double couponAmount);

}
