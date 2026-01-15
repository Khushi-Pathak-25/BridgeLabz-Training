package com.dayeight.budgetwise;

import java.util.ArrayList;
import java.util.List;

public abstract class Budget implements IAnalyzable {
	protected double income;
	protected double totalExpenses;
	protected final List<Transaction> transactions = new ArrayList<>();

	// Lists for category names & limits
	protected final List<String> categoryNames = new ArrayList<>();
	protected final List<Double> categoryLimits = new ArrayList<>();

	public Budget(double initialIncome) {
		this.income = initialIncome;
	}

	// method to add transactions
	public void addTransaction(double amount, String type, String date, String category) {
		if (!type.equalsIgnoreCase("income") && !type.equalsIgnoreCase("expense")) {
			System.out.println("Invalid transaction type: " + type);
			return;
		}
		Transaction t = new Transaction(amount, type, date, category);
		transactions.add(t);

		if (type.equalsIgnoreCase("income")) {
			income += amount;
		} else {
			totalExpenses += amount;
		}
	}

	public double getNetSavings() {
		return income - totalExpenses;
	}

	public void setCategoryLimit(String category, double limit) {
		// Avoid duplicates – update if already exists
		for (int i = 0; i < categoryNames.size(); i++) {
			if (categoryNames.get(i).equalsIgnoreCase(category)) {
				categoryLimits.set(i, limit);
				return;
			}
		}
		// New category
		categoryNames.add(category);
		categoryLimits.add(limit);
	}

	protected double getCategoryLimit(String category) {
		for (int i = 0; i < categoryNames.size(); i++) {
			if (categoryNames.get(i).equalsIgnoreCase(category)) {
				return categoryLimits.get(i);
			}
		}
		return 0.0;
	}

	protected double getSpentInCategory(String category) {
		double spent = 0;
		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("expense") && t.getCategory().equalsIgnoreCase(category)) {
				spent += t.getAmount();
			}
		}
		return spent;
	}

	// method to get all tracked categories
	protected List<String> getTrackedCategories() {
		return new ArrayList<>(categoryNames);
	}
}