package com.methodreferences.nameuppercasing;

import java.util.ArrayList;
import java.util.List;

public class NameUppercasingApp {
    public static void main(String[] args) {
        // sample employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aneek", "Engineering", 85000.0));
        employees.add(new Employee("Kunal", "Marketing", 62000.0));
        employees.add(new Employee("Ruhi", "Finance", 92000.0));
        employees.add(new Employee("Anchal", "HR", 58000.0));
        employees.add(new Employee("Shagun", "Operations", 75000.0));

        System.out.println(" Employee Names in Uppercase");
        System.out.println("--------------------------------------------------");

        // Use method reference String::toUpperCase in stream
        employees.stream()
                .map(emp -> emp.getName()) // get name
                .map(String::toUpperCase) // method reference
                .forEach(System.out::println); // print each uppercase name

        System.out.println("--------------------------------------------------");
        System.out.println("Total employees: " + employees.size());
    }
}