package com.dayone.browserbuddy;

public class HistoryNode {

	String url;
	HistoryNode prev;
	HistoryNode next;
	
	public HistoryNode(String url) {
		this.url = url;
	}
	
}
