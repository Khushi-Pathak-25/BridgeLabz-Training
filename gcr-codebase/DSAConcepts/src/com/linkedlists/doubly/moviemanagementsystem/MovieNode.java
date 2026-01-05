package com.linkedlists.doubly.moviemanagementsystem;

public class MovieNode {

    String title;
    String director;
    int releaseYear;
    double rating;

    MovieNode next;
    MovieNode prev;

    // Constructor 
    MovieNode(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
