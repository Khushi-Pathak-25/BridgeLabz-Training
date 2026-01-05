/*7. Singly Linked List: Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list. 
Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
Add a friend connection between two users.
Remove a friend connection.
Find mutual friends between two users.
Display all friends of a specific user.
Search for a user by Name or User ID.
Count the number of friends for each user.
Hint:
Use a singly linked list where each node contains a list of friends (which can be another linked list or 
array of Friend IDs).
For mutual friends, traverse both lists and compare the Friend IDs.
The List of Friend IDs for each user can be implemented as a nested linked list or array.*/

package com.linkedlists.singly.socialmediafriendconnections;

public class MainSocialMediaFriendConnections {

    public static void main(String[] args) {

        SocialMediaLinkedList network = new SocialMediaLinkedList();

        network.addUser(1, "Khushi", 22);
        network.addUser(2, "Shagun", 21);
        network.addUser(3, "Pawan", 19);
        network.addUser(4, "Aman", 16);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(2, 4);

        System.out.println("Friends of User 2:");
        network.displayFriends(2);

        System.out.println("------------");
        System.out.println("Mutual Friends of 1 and 2:");
        network.findMutualFriends(1, 2);

        System.out.println("------------");
        System.out.println("Remove Friend Connection (1 and 3):");
        network.removeFriendConnection(1, 3);

        System.out.println("------------");
        System.out.println("Friends of User 1:");
        network.displayFriends(1);

        System.out.println("------------");
        System.out.println("Search User by Name:");
        network.searchUserByName("Meena");

        System.out.println("------------");
        System.out.println("Friend Count:");
        network.countFriends();
    }
}