package com.examples.insurancepolicymanagementmap;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem {

	    // Maps
	    static HashMap<Integer, Policy> policyMap = new HashMap<>();
	    static LinkedHashMap<Integer, Policy> insertionOrderMap = new LinkedHashMap<>();
	    static TreeMap<LocalDate, List<Policy>> expiryDateMap = new TreeMap<>();

	    // Add policy
	    static void addPolicy(Policy policy) {
	        policyMap.put(policy.policyNumber, policy);
	        insertionOrderMap.put(policy.policyNumber, policy);

	        expiryDateMap
	                .computeIfAbsent(policy.expiryDate, k -> new ArrayList<>())
	                .add(policy);
	    }

	    // Retrieve policy by number
	    static void getPolicyByNumber(int policyNumber) {
	        Policy policy = policyMap.get(policyNumber);
	        if (policy != null)
	            System.out.println(policy);
	        else
	            System.out.println("Policy not found!");
	    }

	    // Policies expiring in next 30 days
	    static void policiesExpiringSoon() {
	        LocalDate today = LocalDate.now();
	        LocalDate next30Days = today.plusDays(30);

	        System.out.println("Policies expiring in next 30 days:");
	        for (Policy p : policyMap.values()) {
	            if (!p.expiryDate.isBefore(today) && !p.expiryDate.isAfter(next30Days)) {
	                System.out.println(p);
	            }
	        }
	    }

	    // Policies by policyholder name
	    static void getPoliciesByHolder(String holderName) {
	        System.out.println("Policies for " + holderName + ":");
	        for (Policy p : policyMap.values()) {
	            if (p.holderName.equalsIgnoreCase(holderName)) {
	                System.out.println(p);
	            }
	        }
	    }

	    // Remove expired policies
	    static void removeExpiredPolicies() {
	        LocalDate today = LocalDate.now();

	        policyMap.values().removeIf(p -> p.expiryDate.isBefore(today));
	        insertionOrderMap.values().removeIf(p -> p.expiryDate.isBefore(today));
	        expiryDateMap.headMap(today).clear();

	        System.out.println("Expired policies removed.");
	    }

	    // Display all policies (Insertion Order)
	    static void displayAllPolicies() {
	        System.out.println("All Policies (Insertion Order):");
	        for (Policy p : insertionOrderMap.values()) {
	            System.out.println(p);
	        }
	    }
        
	    // main method
	    public static void main(String[] args) {

	        // Adding sample policies
	        addPolicy(new Policy(101, "Amit", LocalDate.of(2026, 2, 10)));
	        addPolicy(new Policy(102, "Neha", LocalDate.of(2026, 1, 25)));
	        addPolicy(new Policy(103, "Amit", LocalDate.of(2025, 12, 30)));
	        addPolicy(new Policy(104, "Riya", LocalDate.of(2024, 12, 15)));

	        // Operations
	        displayAllPolicies();

	        System.out.println("\nRetrieve Policy 102:");
	        getPolicyByNumber(102);

	        System.out.println();
	        policiesExpiringSoon();

	        System.out.println();
	        getPoliciesByHolder("Amit");

	        System.out.println();
	        removeExpiredPolicies();

	        System.out.println();
	        displayAllPolicies();
	    }
	}