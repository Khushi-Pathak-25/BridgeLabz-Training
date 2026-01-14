/*6. TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.*/

package com.daytwo.texteditor;

public class TextEditorMain {

	public static void main(String[] args) {
		TextEditor.addText("Hello ");
		TextEditor.addText("World");

		System.out.println("======== Welcome to TextEditor =========");
		System.out.println("Content: " + TextEditor.content);
        System.out.println("-----------------------------------------");
		TextEditor.undoOperation();
		System.out.println("After Undo: " + TextEditor.content);
		System.out.println("-----------------------------------------");
		TextEditor.redoOperation();
		System.out.println("After Redo: " + TextEditor.content);
	}

}
