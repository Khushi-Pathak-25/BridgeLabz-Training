package com.daytwo.callcenter;

public class Customer {
	
	protected String name;
	protected boolean isVIP;
	
	public Customer(String name, boolean isVIP) {
		this.name = name;
		this.isVIP = isVIP;
	}
	
	public String toString() {
		return name + (isVIP ? "(VIP)" : "");
	}	

}
