package com.examples.votingsystem;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        // LinkedHashMap to store votes in the order 
        Map<String, String> voteOrder = new LinkedHashMap<>();

        voteOrder.put("V1", "Alice");
        voteOrder.put("V2", "Bob");
        voteOrder.put("V3", "Alice");
        voteOrder.put("V4", "Charlie");
        voteOrder.put("V5", "Bob");
        voteOrder.put("V6", "Alice");

        // HashMap to count votes for each candidate
        Map<String, Integer> voteCount = new HashMap<>();

        for (String candidate : voteOrder.values()) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }

        // TreeMap to display results in sorted order
        Map<String, Integer> sortedResults = new TreeMap<>(voteCount);

        // Display vote order
        System.out.println("Voting Order:");
        for (Map.Entry<String, String> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " voted for " + entry.getValue());
        }

        //  Display final vote count
        System.out.println("\nFinal Vote Count:");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Display sorted results
        System.out.println("\nSorted Voting Results:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
