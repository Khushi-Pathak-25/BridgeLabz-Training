package com.dayeight.budgetwise;

public class AnnualBudget extends Budget {

	public AnnualBudget(double annualIncome) {
		super(annualIncome);
	}

	@Override
	public void generateReport() {
		System.out.println("\n================================");
		System.out.println("      ANNUAL BUDGET SUMMARY    ");
		System.out.println("================================");
		System.out.printf("Yearly Income   : Rs.%,.2f%n", income);
		System.out.printf("Yearly Expenses : Rs.%,.2f%n", totalExpenses);
		System.out.printf("Yearly Savings  : Rs.%,.2f%n", getNetSavings());
		System.out.printf("Monthly Avg.    : Rs.%,.2f%n", getNetSavings() / 12);
		System.out.println("================================");
	}

	@Override
	public void detectOverspend() {
		System.out.println("Overspending Alerts:");
		System.out.printf("   Total expenses: Rs.%,.2f  (no category limits)%n", totalExpenses);
		System.out.println("-> Use MonthlyBudget for detailed category checks");
	}
}