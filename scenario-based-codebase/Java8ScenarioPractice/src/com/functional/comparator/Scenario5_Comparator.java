package com.functional.comparator;

import java.util.Comparator;

public class Scenario5_Comparator {

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " Rs. " + price;
        }
    }

    public static void main(String[] args) {

        // 1. Students by rank
        Comparator<Integer> byRank = Integer::compareTo;
        System.out.println("1. Rank comparison: 45 vs 12 ==> " + byRank.compare(45, 12));

        // 2. Employees by salary
        Comparator<Double> bySalary = Double::compareTo;
        System.out.println("2. Salary comparison: 52000 vs 38000 ==> " + bySalary.compare(52000.0, 38000.0));

        // 3. Products by price
        Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.price, p2.price);
        System.out.println("3. Product price comparison:");
        Product p1 = new Product("Laptop", 72000);
        Product p2 = new Product("Phone", 45000);
        System.out.println(p1 + " vs " + p2 + " ==> " + (byPrice.compare(p1, p2) > 0 ? "p1 expensive" : "p2 expensive"));

        // 4. Strings by length
        Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        System.out.println("4. Length comparison: \"Java\" vs \"Lambda\" ==> " + byLength.compare("Java", "Lambda"));

        // 5. Bank accounts by balance
        Comparator<Double> byBalance = Comparator.reverseOrder(); // descending
        System.out.println("5. Balance comparison (desc): 120000 vs 85000 ==> " + byBalance.compare(120000.0, 85000.0));
    }
}