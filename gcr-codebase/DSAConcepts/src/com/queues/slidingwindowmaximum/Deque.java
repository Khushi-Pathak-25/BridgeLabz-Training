package com.queues.slidingwindowmaximum;

public class Deque {

    private int[] arr;
    private int front;
    private int rear;

    // Initialize deque
    public Deque(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    // Check if deque is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Add index at rear
    public void addRear(int value) {
        arr[++rear] = value;
    }

    // Remove index from rear
    public void removeRear() {
        rear--;
    }

    // Remove index from front
    public void removeFront() {
        front++;
    }

    // Get front index
    public int getFront() {
        return arr[front];
    }

    // Get rear index
    public int getRear() {
        return arr[rear];
    }
}