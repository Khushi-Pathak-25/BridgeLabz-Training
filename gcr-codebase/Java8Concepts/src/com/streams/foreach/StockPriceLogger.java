package com.streams.foreach;
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        // Taking example of Live stock prices
        List<Double> stockPrices = Arrays.asList(
            1520.50, 1532.75, 1518.30, 1540.00, 1555.25
        );

        // Print each stock price using forEach()
        stockPrices.forEach(price ->
            System.out.println("Stock Price Update: ₹" + price)
        );
    }
}
