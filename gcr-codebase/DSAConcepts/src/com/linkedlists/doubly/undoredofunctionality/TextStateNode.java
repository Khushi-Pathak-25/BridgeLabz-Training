package com.linkedlists.doubly.undoredofunctionality;

public class TextStateNode {

    String content;
    TextStateNode prev;
    TextStateNode next;

    // constructor
    public TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}