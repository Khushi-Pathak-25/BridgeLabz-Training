package com.collectors.bookstats;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class LibraryBookStatistics {

    public static void main(String[] args) {

        // List of books
        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Education", 300),
                new Book("Advanced Java", "Education", 450),
                new Book("The Alchemist", "Fiction", 200),
                new Book("Harry Potter", "Fiction", 500),
                new Book("Business Studies", "Management", 350)
        );

        // Group by genre and summarize pages
        Map<String, IntSummaryStatistics> bookStats =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        // Display result
        bookStats.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages   : " + stats.getSum());
            System.out.println("Average Pages : " + stats.getAverage());
            System.out.println("Max Pages     : " + stats.getMax());
            System.out.println();
        });
    }
}