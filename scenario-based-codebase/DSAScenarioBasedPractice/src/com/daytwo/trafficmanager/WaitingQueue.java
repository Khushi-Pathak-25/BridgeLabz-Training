package com.daytwo.trafficmanager;

public class WaitingQueue {
	
	private int []queue;
	private int front = 0, rear = -1, size =0;
	
	public WaitingQueue(int capacity) {
		
		queue = new int [capacity];
	}
		
	public void enqueue(int vehicle) {
		if(size == queue.length) {
			System.out.println("Queue Overflow");
			return;
		}
		rear++;
		queue[rear] = vehicle;
		size++;
		
		System.out.println("Vehicle "+ vehicle+" waiting.");
	}
	
	public int dequeue () {
		if(size == 0) {
			System.out.println("Queue Underflow");
			return -1;
		}
		int vehicle = queue[front];
		front++;
		size--;
		
		return vehicle;
	}
	

}
