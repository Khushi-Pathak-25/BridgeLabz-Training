package com.dayeight.budgetwise;

public class MonthlyBudget extends Budget {

	public MonthlyBudget(double monthlyIncome) {
		super(monthlyIncome);
	}

	@Override
	public void generateReport() {
		System.out.println("\n================================");
		System.out.println("     MONTHLY BUDGET REPORT     ");
		System.out.println("================================");
		System.out.printf("Income          : Rs.%,.2f%n", income);
		System.out.printf("Total Expenses  : Rs.%,.2f%n", totalExpenses);
		System.out.printf("Net Savings     : Rs.%,.2f%n", getNetSavings());
		System.out.println("--------------------------------");

		System.out.println("Category Spending:");
		// Use the new helper method
		for (String cat : getTrackedCategories()) {
			double limit = getCategoryLimit(cat);
			double spent = getSpentInCategory(cat);
			System.out.printf("  %-14s : Rs.%,8.2f  (limit: Rs.%,.2f)%n", cat, spent, limit);
		}
		System.out.println("--------------------------------");
	}

	@Override
	public void detectOverspend() {
		System.out.println("Overspending Alerts:");
		boolean any = false;
		for (String cat : getTrackedCategories()) {
			double limit = getCategoryLimit(cat);
			double spent = getSpentInCategory(cat);
			// ignore categories without limit
			if (spent > limit && limit > 0) {
				System.out.printf("  OVER → %s : Rs.%.2f > Rs.%.2f%n", cat, spent, limit);
				any = true;
			}
		}
		if (!any) {
			System.out.println("  All categories within limits.");
		}
	}
}
