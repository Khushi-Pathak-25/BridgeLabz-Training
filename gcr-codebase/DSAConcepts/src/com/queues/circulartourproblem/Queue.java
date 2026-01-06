package com.queues.circulartourproblem;

public class Queue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;

    // Initialize queue
    public Queue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Add element to queue
    public void enqueue(int value) {
        arr[++rear] = value;
        size++;
    }

    // Remove element from queue
    public int dequeue() {
        size--;
        return arr[front++];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get front element
    public int peek() {
        return arr[front];
    }

    // Get current size
    public int size() {
        return size;
    }
}