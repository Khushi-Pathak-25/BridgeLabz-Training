package com.interfaces.marker.sensitivedata;

public class BankAccount implements Sensitive {
    private String accountNumber;
    private String ifscCode;
    private double balance;
    private String panNumber; // sensitive

    // constructor
    public BankAccount(String accountNumber, String ifscCode, double balance, String panNumber) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.balance = balance;
        this.panNumber = panNumber;
    }

    // good string representation (mask sensitive fields)
    @Override
    public String toString() {
        return "BankAccount[Acc=" + accountNumber.substring(0, 4) + "XXXX" +
                ", IFSC=" + ifscCode +
                ", Balance=Rs." + String.format("%.2f", balance) +
                ", PAN=XXXXX" + panNumber.substring(5) + "]";
    }
}