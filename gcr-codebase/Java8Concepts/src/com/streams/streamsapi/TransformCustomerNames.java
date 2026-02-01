package com.streams.streamsapi;

import java.util.*;
import java.util.stream.*;

public class TransformCustomerNames {
    public static void main(String[] args) {

        // List of customer names
        List<String> customers = Arrays.asList(
            "alice", "david", "charlie", "bob", "edward"
        );

        // Stream operations
        customers.stream()

                 // Convert each name to uppercase
                 .map(name -> name.toUpperCase())

                 // Sort names alphabetically
                 .sorted()

                 // Print each name
                 .forEach(name -> System.out.println(name));
    }
}
