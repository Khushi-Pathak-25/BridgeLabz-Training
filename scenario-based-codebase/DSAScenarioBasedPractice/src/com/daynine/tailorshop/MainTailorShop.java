/*9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting*/


package com.daynine.tailorshop;

import java.time.LocalDate;
import java.util.Scanner;

public class MainTailorShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Order " + (i + 1));

            System.out.print("Order Name: ");
            String name = sc.nextLine();

            System.out.print("Delivery Date (yyyy-mm-dd): ");
            String dateInput = sc.nextLine();

            // Convert String to LocalDate
            LocalDate deliveryDate = LocalDate.parse(dateInput);

            orders[i] = new Order(name, deliveryDate);
        }

        // Sort orders by delivery date
        TailorShopInsertionSort.insertionSort(orders);

        System.out.println("\nOrders Sorted by Delivery Deadline:");
        for (Order order : orders) {
            System.out.println(order);
        }

        sc.close();
    }
}

