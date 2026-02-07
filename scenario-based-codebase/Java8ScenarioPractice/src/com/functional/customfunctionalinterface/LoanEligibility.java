package com.functional.customfunctionalinterface;

@FunctionalInterface
public interface LoanEligibility {
	
    boolean isEligible(double salary, int creditScore, int age);
}