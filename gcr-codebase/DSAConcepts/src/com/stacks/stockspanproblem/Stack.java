package com.stacks.stockspanproblem;

public class Stack {

	private int[] arr;
	private int top;

	// Initialize stack with size
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	// Push index onto stack
	public void push(int data) {
		arr[++top] = data;
	}

	// Pop index from stack
	public int pop() {
		return arr[top--];
	}

	// Get top index
	public int peek() {
		return arr[top];
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
}