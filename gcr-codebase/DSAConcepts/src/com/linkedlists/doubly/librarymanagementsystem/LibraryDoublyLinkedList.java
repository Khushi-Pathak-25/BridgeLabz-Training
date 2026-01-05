package com.linkedlists.doubly.librarymanagementsystem;

public class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;
    private int count = 0;

    // Add book at start
    public void addFirst(int id, String title, String author,String genre, boolean available) {

        BookNode node = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        count++;
    }

    // Add book at end
    public void addLast(int id, String title, String author,
                         String genre, boolean available) {

        BookNode node = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
    }

    // Add book at specific position (0-based index)
    public void addAtPosition(int index, int id, String title,
                              String author, String genre, boolean available) {

        if (index < 0 || index > count) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            addFirst(id, title, author, genre, available);
            return;
        }

        if (index == count) {
            addLast(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        BookNode node = new BookNode(id, title, author, genre, available);

        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        count++;
    }

    // Remove book by book ID
    public void removeByBookId(int id) {

        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        count--;
    }

    // search by title of book
    public void searchByTitle(String title) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with this title.");
        }
    }

    // search by author name of book
    public void searchByAuthor(String author) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by this author.");
        }
    }

    // Update availability status by book ID
    public void updateAvailability(int id, boolean available) {

        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = available;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display all books forward
    public void displayForward() {

        if (head == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display all books in reverse
    public void displayReverse() {

        if (tail == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public int getTotalBooks() {
        return count;
    }

    // Method to display a book
    private void displayBook(BookNode node) {
        System.out.println("Book ID    : " + node.bookId);
        System.out.println("Title      : " + node.title);
        System.out.println("Author     : " + node.author);
        System.out.println("Genre      : " + node.genre);
        System.out.println("Available  : " + node.isAvailable);
        System.out.println("-----------------------------");
    }
}
