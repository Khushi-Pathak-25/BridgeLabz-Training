package com.daytwo.texteditor;

public class Stack {

	private Action stack[];
	private int top;

	public Stack(int size) {
		stack = new Action[size];
		top = -1;
	}

	// check whether stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// push element into stack
	public void push(Action action) {
		stack[++top] = action;
	}

	// pop element from stack
	public Action pop() {
		
		if (top == -1) {
            return null;  // or throw exception
        }

		return stack[top--];

	}

	// clear stack
	public void clear() {
		top = -1;
	}

}
