package com.optionaldemo.banking;

import java.util.Optional;

public class BankingApp {

	static class Account {
		private String accountNumber;
		private Double balance;
		private String nominee; 
		private Loan loan;
		private String creditCard; 

		public Account(String accountNumber, Double balance, String nominee, Loan loan, String creditCard) {
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.nominee = nominee;
			this.loan = loan;
			this.creditCard = creditCard;
		}

		public Optional<String> getNominee() {
			return Optional.ofNullable(nominee);
		}

		public Optional<Loan> getLoan() {
			return Optional.ofNullable(loan);
		}

		public Optional<Double> getBalance() {
			return Optional.ofNullable(balance);
		}

		public Optional<String> getCreditCard() {
			return Optional.ofNullable(creditCard);
		}
	}

	static class Loan {
		private double amount;
		private String loanId;

		public Loan(double amount, String loanId) {
			this.amount = amount;
			this.loanId = loanId;
		}

		public String getInfo() {
			return "Loan " + loanId + " of Rs. " + amount;
		}
	}

	public static void main(String[] args) {

		Account acc1 = new Account("ACC-987654", 45000.0, "Mother", null, "CC-4455");
		Account acc2 = new Account("ACC-123456", null, null, new Loan(500000, "L789"), null);

		// 1. Nominee
		System.out.println("1. Nominee:");
		acc1.getNominee().ifPresentOrElse(n -> System.out.println("Nominee: " + n),
				() -> System.out.println("No nominee"));

		// 2. Loan details
		System.out.println("\n2. Loan:");
		acc2.getLoan().map(Loan::getInfo).ifPresent(System.out::println);

		// 3. Balance or minimum
		System.out.println("\n3. Balance:");
		double bal = acc2.getBalance().orElse(1000.0); // min balance
		System.out.println("Effective balance: Rs. " + bal);

		// 4. Transaction ref 
		Optional<String> txnRef = Optional.ofNullable(getTransactionRef());
		String ref = txnRef.orElse("N/A");
		System.out.println("\n4. Transaction ref: " + ref);

		// 5. Credit card details
		System.out.println("\n5. Credit Card:");
		acc1.getCreditCard().ifPresentOrElse(cc -> System.out.println("Card ending: " + cc.substring(cc.length() - 4)),
				() -> System.out.println("No credit card linked"));
	}

	private static String getTransactionRef() {
		return null; // missing
	}
}