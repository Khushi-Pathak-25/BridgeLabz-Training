package com.collectors.bookstats;

class Book {
    private String title;
    private String genre;
    private int pages;

    // Constructor
    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}