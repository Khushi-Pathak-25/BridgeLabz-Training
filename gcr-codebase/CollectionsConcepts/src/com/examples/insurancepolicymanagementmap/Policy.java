package com.examples.insurancepolicymanagementmap;

import java.time.LocalDate;

class Policy {
	
    int policyNumber;
    String holderName;
    LocalDate expiryDate;

    Policy(int policyNumber, String holderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | Expiry: " + expiryDate;
    }
}
