package com.collectors.orderrevenue;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        // Order list
        List<Order> orders = Arrays.asList(
                new Order("Khushi", 2500.50),
                new Order("Aman", 1800.00),
                new Order("Khushi", 1200.75),
                new Order("Riya", 3000.00),
                new Order("Aman", 700.25)
        );

        // Sum order amounts per customer
        Map<String, Double> revenueByCustomer =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomerName,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        // Print result
        System.out.println("Order Revenue Summary:");
        revenueByCustomer.forEach((customer, total) ->
                System.out.println(customer + " -> Rs." + total)
        );
    }
}