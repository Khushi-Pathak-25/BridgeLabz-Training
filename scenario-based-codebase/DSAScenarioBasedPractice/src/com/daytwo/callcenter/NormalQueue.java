package com.daytwo.callcenter;

public class NormalQueue {
	
	private Node front, rear;
	
	private class Node {
		
		Customer data;
	    Node next;
	    
		public Node(Customer customer) {
			this.data = customer;
			this.next = null;
		}
		
	}
	
		// enqueue operation 
	    public void enqueue(Customer customer) {
	    	
	    	Node newNode = new Node(customer);
	    	
	    	if(rear == null) {
	    	
	    	   front = rear = newNode;
	    	}
	    	else {
	    		rear.next = newNode;
	    		rear = newNode;
	    	}
	    	
	    }
	    
	    // dequeue operation
	    public Customer dequeue() {
	    	if(front == null) {
	    		return null;
	    	}
	    	
	    	Customer customer = front.data;
	    	front = front.next;
	    	
	    	if(front == null) {
	    		rear = null;  	  	
	    	}
	    	return customer; 
	    }
	    
	    public boolean isEmpty() {
	    	return front == null;
	    }

}
