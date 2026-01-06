package com.stacks.sortstackusingrecursion;

public class Stack {

    private int[] arr;
    private int top;

    // Initializes stack with fixed size
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    // Pushes element into stack
    public void push(int data) {
        arr[++top] = data;
    }

    // Pops element from stack
    public int pop() {
        return arr[top--];
    }

    // Returns top element
    public int peek() {
        return arr[top];
    }

    // Checks if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Displays stack elements
    public void display() {
    	System.out.print("[ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + (i == 0? "" : ", "));
        }
        System.out.println(" ]");
    }
}
