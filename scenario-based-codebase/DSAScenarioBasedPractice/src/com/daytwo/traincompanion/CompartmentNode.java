package com.daytwo.traincompanion;

public class CompartmentNode {
	
	protected String name;
	protected CompartmentNode prev;
	protected CompartmentNode next;
	
	public CompartmentNode(String name) {
		this.name = name;
		this.prev = null;
		this.next = null;
	}
}
