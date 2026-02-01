package com.streams.streamsapi;

import java.util.*;
import java.util.stream.*;

class InsuranceClaim {
    String claimId;
    String claimType;
    double claimAmount;

    // Create Constructor
    InsuranceClaim(String claimId, String claimType, double claimAmount) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }

    //Getter methods
    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        // List of insurance claims
        List<InsuranceClaim> claims = Arrays.asList(
            new InsuranceClaim("C101", "Health", 50000),
            new InsuranceClaim("C102", "Vehicle", 20000),
            new InsuranceClaim("C103", "Health", 30000),
            new InsuranceClaim("C104", "Life", 80000),
            new InsuranceClaim("C105", "Vehicle", 40000)
        );

        // Stream operation to find average claim amount per type
        Map<String, Double> averageClaimByType =
            claims.stream()
                  // Group claims by claim type
                  .collect(Collectors.groupingBy(
                      InsuranceClaim::getClaimType,

                      // Calculate average claim amount
                      Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                  ));

        // Print the result
        averageClaimByType.forEach((type, avgAmount) ->
            System.out.println(type + " Claim Average: " + avgAmount)
        );
    }
}
