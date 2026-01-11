package com.dayone.ambulanceroute;

public class UnitNode {

   String name;
   boolean isAvailable;   
   UnitNode next;

   public UnitNode(String name, boolean isAvailable) {
	this.name = name;
	this.isAvailable = isAvailable;
	this.next = null;
   }
}
