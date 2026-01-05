package com.linkedlists.circular.roundrobinschedulingalgorithm;

public class ProcessNode {

	int processId;
	int burstTime;
	int remainingTime;
	int priority;

	int waitingTime;
	int turnaroundTime;

	ProcessNode next;

	// Constructor
	ProcessNode(int processId, int burstTime, int priority) {
		this.processId = processId;
		this.burstTime = burstTime;
		this.remainingTime = burstTime;
		this.priority = priority;
		this.next = null;
	}
}