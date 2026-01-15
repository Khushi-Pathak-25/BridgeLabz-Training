/*23. "BudgetWise – Personal Finance Tracker"
Story: 
	● BudgetWise helps users plan monthly budgets and track income/expenses across categories.
Requirements:
	● Transaction class: amount, type, date, category.
	● Budget class: income, limit, categoryLimits[].
	● Interface IAnalyzable with generateReport() and detectOverspend().
	● Constructors for monthly budgets with custom categories.
	● Use operators to calculate net savings: income - totalExpenses.
	● Encapsulation: restrict direct expense editing.
	● Inheritance: MonthlyBudget, AnnualBudget.
	● Polymorphism: report format varies (monthly vs yearly).*/

package com.dayeight.budgetwise;

public class MainBudgetWise {

	public static void main(String[] args) {
		System.out.println("================== BUDGETWISE APP =================");

		MonthlyBudget budget = new MonthlyBudget(85_000);

		// Set category limits
		budget.setCategoryLimit("Rent", 25_000);
		budget.setCategoryLimit("Groceries", 10_000);
		budget.setCategoryLimit("Transport", 5_000);
		budget.setCategoryLimit("Entertainment", 4_000);

		// Add transactions
		budget.addTransaction(85_000, "income", "2026-01-01", "Salary");
		budget.addTransaction(24_000, "expense", "2026-01-03", "Rent");
		budget.addTransaction(8_500, "expense", "2026-01-05", "Groceries");
		budget.addTransaction(6_200, "expense", "2026-01-10", "Transport");
		budget.addTransaction(5_800, "expense", "2026-01-12", "Entertainment");
		budget.addTransaction(3_000, "expense", "2026-01-15", "Groceries"); // overspend

		// Show reports
		budget.generateReport();
		budget.detectOverspend();

		// Annual budget
		AnnualBudget annual = new AnnualBudget(1_200_000);
		annual.addTransaction(1_200_000, "income", "2026-01-01", "Salary");
		annual.addTransaction(5_00_000, "expense", "2026-02-01", "Rent");
		annual.addTransaction(10_00_000, "expense", "2026-03-01", "Transport");
		annual.generateReport();
		annual.detectOverspend();

		System.out.println("\n================== Thanks for using =================");
	}
}
