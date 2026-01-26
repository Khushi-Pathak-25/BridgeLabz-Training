package com.exceptionhandling.throwvsthrows;

import java.util.Scanner;

public class InterestCalculator {
	// Method that throws exception to caller
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

		// Throwing exception manually
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException();
		}

		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter amount: ");
			double amount = input.nextDouble();

			System.out.print("Enter rate: ");
			double rate = input.nextDouble();

			System.out.print("Enter years: ");
			int years = input.nextInt();

			double interest = calculateInterest(amount, rate, years);
			System.out.println("Calculated Interest: " + interest);

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}
		input.close();
	}
}
