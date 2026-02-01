package com.streams.foreach;

import java.time.LocalDateTime;
import java.util.*;

public class LoggingTransactions {
    public static void main(String[] args) {

        // List of transaction IDs
        List<String> transactionIds = Arrays.asList(
            "TXN101", "TXN102", "TXN103", "TXN104"
        );

        // Print current time and transaction ID
        transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
