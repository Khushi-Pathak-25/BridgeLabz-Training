package com.linkedlists.circular.roundrobinschedulingalgorithm;

public class RoundRobinCircularLinkedList {

	private ProcessNode head;
	private ProcessNode tail;
	private int totalProcesses = 0;
	private int currentTime = 0;

	// Add process at last
	public void addProcess(int id, int burstTime, int priority) {

		ProcessNode node = new ProcessNode(id, burstTime, priority);

		if (head == null) {
			head = tail = node;
			node.next = node;
		} else {
			node.next = head;
			tail.next = node;
			tail = node;
		}
		totalProcesses++;
	}

	// remove a process
	private void removeProcess(ProcessNode prev, ProcessNode current) {

		if (current == head && current == tail) {
			head = tail = null;
		} else {
			prev.next = current.next;
			if (current == head)
				head = current.next;
			if (current == tail)
				tail = prev;
		}
		totalProcesses--;
	}

	// method to execute round robin
	public void execute(int timeQuantum) {

		if (head == null) {
			System.out.println("No processes to schedule.");
			return;
		}

		ProcessNode current = head;
		ProcessNode prev = tail;

		while (totalProcesses > 0) {

			System.out.println("---- Current Round ----");

			int count = totalProcesses;

			while (count-- > 0) {

				if (current.remainingTime > 0) {

					int execTime = Math.min(timeQuantum, current.remainingTime);
					current.remainingTime -= execTime;
					currentTime += execTime;

					// Update waiting time for other processes
					updateWaitingTime(current, execTime);

					if (current.remainingTime == 0) {
						current.turnaroundTime = currentTime;
						removeProcess(prev, current);
						current = prev.next;
					} else {
						prev = current;
						current = current.next;
					}
				}
			}
			displayQueue();
		}
	}

	// Update waiting time for other processes
	private void updateWaitingTime(ProcessNode executing, int execTime) {

		if (head == null)
			return;

		ProcessNode temp = head;
		do {
			if (temp != executing && temp.remainingTime > 0) {
				temp.waitingTime += execTime;
			}
			temp = temp.next;
		} while (temp != head);
	}

	// display process queue
	public void displayQueue() {

		if (head == null) {
			System.out.println("Queue empty.");
			return;
		}

		ProcessNode temp = head;
		do {
			System.out.println("PID : " + temp.processId + " | Remaining Time : " + temp.remainingTime);
			temp = temp.next;
		} while (temp != head);

		System.out.println("------------------------");
	}

	// display average time
	public void displayAverageTimes(ProcessNode[] completed) {

		int totalWT = 0;
		int totalTAT = 0;

		for (ProcessNode p : completed) {
			totalWT += p.waitingTime;
			totalTAT += p.turnaroundTime;
		}

		System.out.println("Average Waiting Time     : " + (double) totalWT / completed.length);
		System.out.println("Average Turnaround Time  : " + (double) totalTAT / completed.length);
	}
}
