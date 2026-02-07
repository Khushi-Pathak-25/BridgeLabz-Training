package com.functional.function;

import java.util.function.Function;

public class Scenario2_Function {
    public static void main(String[] args) {

        // 1. Marks to Grade
        Function<Integer, String> marksToGrade = marks -> {
            if (marks >= 90) return "A+";
            if (marks >= 80) return "A";
            if (marks >= 70) return "B";
            if (marks >= 60) return "C";
            return "F";
        };
        System.out.println("1. Marks to Grade:");
        System.out.println("92 ==> " + marksToGrade.apply(92));
        System.out.println("78 ==> " + marksToGrade.apply(78));
        System.out.println("55 ==> " + marksToGrade.apply(55));

        // 2. Monthly to Annual salary
        Function<Double, Double> annualSalary = monthly -> monthly * 12;
        System.out.println("\n2. Annual Salary:");
        System.out.println("Rs. 45,000/month ==> Rs. " + annualSalary.apply(45000.0));

        // 3. Discounted price (15% off)
        Function<Double, Double> discountedPrice = price -> price * 0.85;
        System.out.println("\n3. Discounted price (15% off):");
        System.out.println("Rs. 1200 ==> Rs. " + discountedPrice.apply(1200.0));

        // 4. Name to uppercase
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println("\n4. Uppercase name:");
        System.out.println("Khushi ==> " + toUpper.apply("Khushi"));

        // 5. Celsius to Fahrenheit
        Function<Double, Double> cToF = c -> (c * 9 / 5) + 32;
        System.out.println("\n5. Celsius to Fahrenheit:");
        System.out.println("25°C ==> " + cToF.apply(25.0) + "°F");
    }
}