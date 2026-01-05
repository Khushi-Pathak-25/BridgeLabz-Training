package com.linkedlists.doubly.undoredofunctionality;

public class TextEditorHistory {

	private TextStateNode head;
	private TextStateNode tail;
	private TextStateNode current;

	private int size = 0;
	private final int MAX_HISTORY = 10;

	// Adds a new text state after typing or action
	public void addState(String content) {

		TextStateNode newNode = new TextStateNode(content);

		// If undo was used, remove redo history
		if (current != null && current.next != null) {
			current.next.prev = null;
			current.next = null;
			tail = current;
			size = calculateSize();
		}

		if (head == null) {
			head = tail = current = newNode;
			size = 1;
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		current = newNode;
		size++;

		// Remove oldest state if limit exceeded
		if (size > MAX_HISTORY) {
			head = head.next;
			head.prev = null;
			size--;
		}
	}

	// Moves to previous text state
	public void undo() {

		if (current == null || current.prev == null) {
			System.out.println("Nothing to undo.");
			return;
		}

		current = current.prev;
	}

	// Moves to next text state
	public void redo() {

		if (current == null || current.next == null) {
			System.out.println("Nothing to redo.");
			return;
		}

		current = current.next;
	}

	// Displays current text content
	public void displayCurrentState() {

		if (current == null) {
			System.out.println("Editor is empty.");
			return;
		}

		System.out.println("Current Text:");
		System.out.println(current.content);
		System.out.println("---------------------");
	}

	// Recalculates size after trimming redo history
	private int calculateSize() {
		int count = 0;
		TextStateNode temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}
