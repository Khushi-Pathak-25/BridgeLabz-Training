/*2. BrowserBuddy – Tab History Manager (Doubly Linked List + Stack)
Story: Neha is working on a custom browser. Each open tab maintains its browsing history 
with "Back" and "Forward" operations. She uses a Doubly Linked List for history and a 
Stack to hold closed tabs for reopening.
Requirements:
● Support forward and backward navigation.
● Restore recently closed tabs.
● Maintain memory-efficient tab management using pointers.*/

package com.dayone.browserbuddy;

import java.util.*;

public class MainBrowserBuddy {
	
	public static void main(String[]args) {
		
		Stack<Tab> closedTabs = new Stack<>();
		
		Tab tab1 = new Tab("google.com");
		
		tab1.visit("YouTube.com");
		tab1.visit("Github.com");
		
		tab1.back(); // YouTube
		tab1.back(); // google
		
		tab1.forward(); // youtube
		
		tab1.displayCurrentPage();
		
	}

}
