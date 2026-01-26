package com.reflection.author;

public class RetrieveAuthor {
    public static void main(String[] args) {
	Author author = Book.class.getAnnotation(Author.class);

	System.out.println(author.name());
    }
}