package com.stacks.stockspanproblem;

public class MainStockSpanProblem {

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\nStock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}