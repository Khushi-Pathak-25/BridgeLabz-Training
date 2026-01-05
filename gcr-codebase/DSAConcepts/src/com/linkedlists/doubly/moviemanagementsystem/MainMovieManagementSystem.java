/*2. Doubly Linked List: Movie Management System
Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
Add a movie record at the beginning, end, or at a specific position.
Remove a movie record by Movie Title.
Search for a movie record by Director or Rating.
Display all movie records in both forward and reverse order.
Update a movie's Rating based on the Movie Title.
Hint:
Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to the previous node.
Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
For reverse display, start from the tail and traverse backward using the prev pointers.*/

package com.linkedlists.doubly.moviemanagementsystem;

public class MainMovieManagementSystem {

    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addFirst("Harry Potter", "Chris Columbus", 2001, 7.6);
        list.addEnd("Jurassic Park", "Steven Spielberg", 1993, 8.2);
        list.addEnd("Titanic", "James Cameron", 1997, 7.8);

        list.addAtPosition(1, "Avatar", "James Cameron", 2009, 7.9);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("Movies (Reverse):");
        list.displayReverse();

        System.out.println("Search by Director: James Cameron");
        list.searchByDirector("James Cameron");

        System.out.println("Update Rating for Titanic:");
        list.updateRating("Titanic", 8.0);
        System.out.println("--------------------------");
        
        System.out.println("Remove Movie: Avatar");
        list.removeByTitle("Avatar");
        System.out.println("--------------------------");

        System.out.println("Final Movie List:");
        list.displayForward();
    }
}