package com.linkedlists.singly.socialmediafriendconnections;

public class FriendNode {

    int friendId;
    FriendNode next;

    // Constructor
    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}