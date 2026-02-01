package com.collectors.employeesalary;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        // Employee list
        List<Employee> employees = Arrays.asList(
                new Employee("Khushi", "IT", 60000),
                new Employee("Aman", "HR", 45000),
                new Employee("Riya", "IT", 70000),
                new Employee("Neha", "Finance", 55000),
                new Employee("Rahul", "HR", 50000)
        );

        // Group by department and calculate average salary
        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        // Print result
        System.out.println("Average Salary by Department:");
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> " + avgSalary)
        );
    }
}