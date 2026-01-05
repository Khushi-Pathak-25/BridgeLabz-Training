/*8. Doubly Linked List: Undo/Redo Functionality for Text Editor
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. 
Each node represents a state of the text content (e.g., after typing a word or performing a command). 
Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
Hint:
Use a doubly linked list where each node represents a state of the text.
The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
Keep track of the current state and adjust the next and prev pointers for undo/redo operations.*/

package com.linkedlists.doubly.undoredofunctionality;

public class MainUndoRedoTextEditor {

    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hey");
        editor.addState("Hey Hello");
        editor.addState("Hey Hello!");
        editor.displayCurrentState();

        System.out.println("Undo :-");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("Undo :-");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("Redo :-");
        editor.redo();
        editor.displayCurrentState();

        System.out.println("Add State :-");
        editor.addState("Hey Helloo!!");
        editor.displayCurrentState();

        System.out.println("Redo :-");
        editor.redo();
    }
}
