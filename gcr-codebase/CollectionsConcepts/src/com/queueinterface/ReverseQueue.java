package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
	
	public static void reverseQueue(Queue<Integer> queue) {
		if (queue == null || queue.isEmpty()) {
			return;
		}

		// take the front element
		Integer front = queue.poll();

		// recursively reverse the remaining queue
		reverseQueue(queue);

		// add the removed element at the end
		queue.add(front);
	}

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);

		System.out.println("Original Queue: " + q);

		reverseQueue(q);
		System.out.println("Reversed Queue : " + q);
	}
}