package com.functional.customfunctionalinterface;

public class Scenario7_CustomFunctionalInterface {
    public static void main(String[] args) {

        // 1. Bonus calculation (10% base + performance)
        BonusCalculator bonus = (salary, score) -> salary * 0.10 + (score * 200);
        System.out.println("1. Bonus: " + bonus.calculate(52000, 85));

        // 2. Loan eligibility
        LoanEligibility loanCheck = (salary, credit, age) ->
                salary >= 25000 && credit >= 700 && age >= 21 && age <= 60;
        System.out.println("2. Loan eligible? " + loanCheck.isEligible(38000, 720, 29));

        // 3. Income tax (simple slab example)
        TaxCalculator tax = income -> {
            if (income <= 500000) return 0;
            if (income <= 1000000) return (income - 500000) * 0.1;
            return (income - 1000000) * 0.2 + 50000;
        };
        System.out.println("3. Tax on Rs. 12,50,000: Rs. " + tax.computeTax(1250000));

        // 4. Login validation
        LoginValidator login = (user, pass) -> user.equals("admin") && pass.equals("pass123");
        System.out.println("4. Login success? " + login.validate("admin", "pass123"));
        System.out.println("   Login success? " + login.validate("admin", "wrong"));
    }
}