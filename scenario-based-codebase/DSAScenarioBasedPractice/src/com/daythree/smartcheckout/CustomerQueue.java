package com.daythree.smartcheckout;

public class CustomerQueue {
	
	private class Node{
		
		Customer data;
		Node next;
		
		public Node(Customer data) {
			this.data = data;
			this.next = null;
		}		
	}
	private Node front , rear;
	private int queue[];
	
	// enqueue operation
	public void enqueue (Customer customer) {
		
		 Node newNode = new Node(customer);
		 
		 if(rear == null) {
			 front = rear = newNode;
			 return;
		 }
		 rear.next = newNode;
		 rear = newNode;
	}
	
	// dequeue operation
	public Customer dequeue() {
		if(front == null) {
			System.out.println("Queue is empty ! No customer..");
			return null;
		}	
		Customer data = front.data;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}		
		return data;
	}
	
	// check whether the queue is empty
	public boolean isEmpty() {
		return front == null;
	}

}
