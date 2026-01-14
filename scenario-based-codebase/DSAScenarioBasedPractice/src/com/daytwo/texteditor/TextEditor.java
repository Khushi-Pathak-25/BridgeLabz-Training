package com.daytwo.texteditor;

public class TextEditor {

	static String content = "";

	static Stack undoStack = new Stack(10);
	static Stack reduStack = new Stack(10);

	// insert element in stack
	public static void addText(String text) {
		content += text;
		undoStack.push(new Action("Insert", text));
		reduStack.clear();
	}

	// remove element from Stack
	public static void removeText(String text) {
		if (content.endsWith(text)) {

			content = content.substring(0, content.length() - text.length());

			undoStack.push(new Action("Delete", text));
			reduStack.clear();
		}
	}

	// undo operation
	public static void undoOperation() {
		if (undoStack.isEmpty()) {
			System.out.println("Nothing to Undo !");
			return;
		}
		// remove the top element from stack
		Action action = undoStack.pop();
		if (action.type.equals("Insert")) {
			content = content.substring(0, content.length() - action.text.length());
		} else {
			content += action.text;
		}

		reduStack.push(action);
		;
	}

	// redo operation
	public static void redoOperation() {
		if (reduStack.isEmpty()) {
			System.out.println("Nothing to redu !");
			return;
		}
		Action action = reduStack.pop();
		if (action.type.equals("Insert")) {
			content += action.text;
		} else {
			content = content.substring(0, content.length() - action.text.length());
		}

		undoStack.push(action);
	}

}
