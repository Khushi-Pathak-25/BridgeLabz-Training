package com.examples.insurancepolicymanagementset;

import java.time.LocalDate;

public class Policy implements Comparable<Policy> {
	String policyNumber;
	String name;
	LocalDate expiry;
	String type;
	double premium;

	// constructor
	public Policy(String policyNumber, String name, LocalDate expiry, String type, double premium) {
		this.policyNumber = policyNumber;
		this.name = name;
		this.expiry = expiry;
		this.type = type;
		this.premium = premium;
	}

	// method to compare policies
	@Override
	public int compareTo(Policy other) {
		return expiry.compareTo(other.expiry);
	}

	// check if two policies are equal
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Policy policy = (Policy) o;
		return policyNumber.equals(policy.policyNumber);
	}

	// own hashcode logic
	@Override
	public int hashCode() {
		return policyNumber.hashCode();
	}

	// good string representation
	@Override
	public String toString() {
		return policyNumber + "  " + name + "  " + expiry + "  " + type;
	}
}