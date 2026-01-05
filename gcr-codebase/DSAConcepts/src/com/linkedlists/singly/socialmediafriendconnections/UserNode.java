package com.linkedlists.singly.socialmediafriendconnections;

public class UserNode {

    int userId;
    String name;
    int age;

    // Nested linked list
    FriendNode friendsHead;
    UserNode next;

    // Constructor
    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }
}