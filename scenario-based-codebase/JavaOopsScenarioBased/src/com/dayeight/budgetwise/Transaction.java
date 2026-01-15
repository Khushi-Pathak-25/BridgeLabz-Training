package com.dayeight.budgetwise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final double amount;
    private final String type;      // "income" or "expense"
    private final LocalDate date;
    private final String category;

    public Transaction(double amount, String type, String dateStr, String category) {
        this.amount = amount;
        this.type = type.toLowerCase();
        this.date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %.2f | %s", date, type, amount, category);
    }
}