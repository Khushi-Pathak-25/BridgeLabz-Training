package com.designprinciples.librarycasestudy;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    // Single instance
    private static LibraryCatalog instance;

    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // Private constructor
    private LibraryCatalog() {}

    // Global access point
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyUsers(book.getTitle());
    }

    // Observer methods
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyUsers(String bookName) {
        for (Observer o : observers) {
            o.update("New book available: " + bookName);
        }
    }
}
