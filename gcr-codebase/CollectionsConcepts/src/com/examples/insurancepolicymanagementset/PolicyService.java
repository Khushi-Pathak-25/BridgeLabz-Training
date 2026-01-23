package com.examples.insurancepolicymanagementset;

import java.time.LocalDate;
import java.util.*;

public class PolicyService {
	private Set<Policy> fastLookup = new HashSet<>();
	private Set<Policy> ordered = new LinkedHashSet<>();
	private Set<Policy> sortedByExpiry = new TreeSet<>();

	public void add(Policy p) {
		fastLookup.add(p);
		ordered.add(p);
		sortedByExpiry.add(p);
	}

	// All unique policies
	public Set<Policy> getAll() {
		return fastLookup;
	}

	// Expiring soon (next 30 days)
	public List<Policy> getExpiringSoon() {
		LocalDate today = LocalDate.now();
		LocalDate limit = today.plusDays(30);

		List<Policy> soon = new ArrayList<>();
		for (Policy p : sortedByExpiry) {
			if (p.expiry.isAfter(today) && !p.expiry.isAfter(limit)) {
				soon.add(p);
			}
		}
		return soon;
	}

	// Get by type
	public List<Policy> getByType(String type) {
		List<Policy> result = new ArrayList<>();
		for (Policy p : fastLookup) {
			if (p.type.equalsIgnoreCase(type)) {
				result.add(p);
			}
		}
		return result;
	}

	// Show what happens with duplicate
	public void showDuplicate(Policy p) {
		System.out.println("Adding duplicate " + p.policyNumber + " -> " + fastLookup.add(p));
	}
}
