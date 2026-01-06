package com.stacks.queueusingstacks;

public class QueueUsingStacks {

	private Stack stack1;
	private Stack stack2;

	// Initializes queue with fixed size
	public QueueUsingStacks(int size) {
		stack1 = new Stack(size);
		stack2 = new Stack(size);
	}

	// Adds element to the queue
	public void enqueue(int data) {
		stack1.push(data);
	}

	// Removes element from the queue
	public int dequeue() {

		// Queue empty check
		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		// Move elements only if needed
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.pop();
	}

	// Returns front element
	public int peek() {

		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.peek();
	}
}