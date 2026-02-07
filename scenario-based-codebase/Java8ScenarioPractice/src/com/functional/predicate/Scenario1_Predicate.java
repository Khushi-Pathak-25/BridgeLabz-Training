package com.functional.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Scenario1_Predicate {

    static class Student {
        String name;
        int attendancePercent;

        Student(String name, int attendancePercent) {
            this.name = name;
            this.attendancePercent = attendancePercent;
        }

        @Override
        public String toString() {
            return name + " (" + attendancePercent + "%)";
        }
    }

    public static void main(String[] args) {

        // 1. Student exam eligibility
        Predicate<Student> examEligible = s -> s.attendancePercent >= 75;
        List<Student> students = Arrays.asList(
                new Student("Abhay", 76),
                new Student("Kushal", 88),
                new Student("Reena", 96),
                new Student("Seena", 56)
        );

        System.out.println("1. Exam eligibility (>= 75% attendance):");
        students.forEach(s ->
                System.out.println(s + " ==> " + (examEligible.test(s) ? "Eligible" : "Not Eligible")));

        // 2. Salary > 30,000
        Predicate<Double> highSalary = salary -> salary > 30000;
        System.out.println("\n2. Salary check:");
        System.out.println("42000 ==> " + highSalary.test(42000.0));
        System.out.println("28000 ==> " + highSalary.test(28000.0));

        // 3. Valid withdrawal
        Predicate<Double> validWithdrawal = amount -> amount > 0 && amount <= 50000;
        System.out.println("\n3. Valid withdrawal (0 < amount <= 50,000):");
        System.out.println("Rs. 12000 ==> " + validWithdrawal.test(12000.0));
        System.out.println("Rs. -500 ==> " + validWithdrawal.test(-500.0));

        // 4. Free delivery (order > 499)
        Predicate<Double> freeDelivery = amount -> amount > 499;
        System.out.println("\n4. Free delivery (order > ₹499):");
        System.out.println("Rs. 720 ==> " + freeDelivery.test(720.0));
        System.out.println("Rs. 450 ==> " + freeDelivery.test(450.0));

        // 5. Even / Odd number
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("\n5. Even/Odd:");
        Arrays.asList(4, 7, 12, 19, 28).forEach(n ->
                System.out.println(n + " ==> " + (isEven.test(n) ? "Even" : "Odd")));
    }
}