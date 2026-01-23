package com.queueinterface;

import java.util.*;

public class StackUsingTwoQueues {
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();

	// Push element - O(1)
	public void push(int x) {
		q1.add(x);
	}

	// Pop - O(n)
	public int pop() {
		if (q1.isEmpty()) {
			return -1;
		}

		// Move all except last element to q2
		while (q1.size() > 1) {
			q2.add(q1.remove());
		}

		// Get the top element (last one)
		int top = q1.remove();

		// Swap queues
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

		return top;
	}

	// Peek (top)
	public int top() {
		if (q1.isEmpty()) {
			return -1;
		}

		while (q1.size() > 1) {
			q2.add(q1.remove());
		}

		int top = q1.peek();
		q2.add(q1.remove());

		// Swap back
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

		return top;
	}

	public boolean isEmpty() {
		return q1.isEmpty();
	}

	public static void main(String[] args) {
		StackUsingTwoQueues stack = new StackUsingTwoQueues();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Popped: " + stack.pop()); // 30
		System.out.println("Top   : " + stack.top()); // 20
		System.out.println("Popped: " + stack.pop()); // 20
		System.out.println("Popped: " + stack.pop()); // 10
		System.out.println("Popped: " + stack.pop()); // -1 (empty)
		System.out.println("Is empty? " + stack.isEmpty()); // true
	}
}
