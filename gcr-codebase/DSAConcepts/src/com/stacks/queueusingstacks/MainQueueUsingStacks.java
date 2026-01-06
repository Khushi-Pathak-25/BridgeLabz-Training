package com.stacks.queueusingstacks;

public class MainQueueUsingStacks {

	public static void main(String[] args) {

		QueueUsingStacks queue = new QueueUsingStacks(5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		System.out.println("Dequeue      : " + queue.dequeue());
		System.out.println("Peek (front) : " + queue.peek());
		System.out.println("Dequeue      : " + queue.dequeue());
		System.out.println("Dequeue      : " + queue.dequeue());
		System.out.println("Dequeue      : " + queue.dequeue());
	}
}