/*15. "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates.*/

package com.dayfive.bookbazaar;

import java.util.Scanner;

public class BookBazaarDigitalBookstoreSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name:");
        String user = sc.nextLine();

        System.out.println("Choose Book Type (1-EBook, 2-PrintedBook):");
        int choice = sc.nextInt();

        sc.nextLine(); // buffer clear
        System.out.println("Enter Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter Author:");
        String author = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Stock:");
        int stock = sc.nextInt();

        System.out.println("Enter Quantity:");
        int qty = sc.nextInt();

        Book book;

        if (choice == 1) {
            book = new EBook(title, author, price, stock);
        } else {
            book = new PrintedBook(title, author, price, stock);
        }

        Order order = new Order(user, book, qty, "Placed");
        order.confirmOrder();
        order.showOrderDetails();

        sc.close();
    }
}
