package com.encapsulationpolymorphism.librarymanagementsystem;

import java.util.*;

public class MainLibrarayManagementSystem {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();

        System.out.print("Enter number of library items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nItem " + i);
            System.out.print("Enter Item ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Item Type (1-Book, 2-Magazine, 3-DVD): ");
            int type = sc.nextInt();

            LibraryItem item;

            if (type == 1) {
                item = new Book(id, title, author);
            } else if (type == 2) {
                item = new Magazine(id, title, author);
            } else {
                item = new DVD(id, title, author);
            }

            items.add(item);
        }

        // Polymorphism in action
        for (LibraryItem item : items) {

            item.getItemDetails();

            Reservable r = (Reservable) item;

            if (r.checkAvailability()) {
                sc.nextLine();
                System.out.print("Enter borrower name to reserve: ");
                String borrower = sc.nextLine();
                r.reserveItem(borrower);
            } else {
                System.out.println("Item is not available.");
            }

            System.out.println("----------------------------");
        }

        sc.close();
    }

}
