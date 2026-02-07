package com.streams.employeequeries;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeQueriesSolution {

    // Employee class
    static class Employee {
        private int id;
        private String name;
        private int age;
        private String gender;
        private String department;
        private int yearOfJoining;
        private double salary;

        public Employee(int id, String name, int age, String gender,
                        String department, int yearOfJoining, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }

        // Getters
        public int getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getGender() { return gender; }
        public String getDepartment() { return department; }
        public int getYearOfJoining() { return yearOfJoining; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", department='" + department + '\'' +
                    ", yearOfJoining=" + yearOfJoining +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {

        // Sample Data
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Rohan", 32, "Male", "IT", 2015, 85000),
                new Employee(102, "Priya", 28, "Female", "HR", 2018, 62000),
                new Employee(103, "Amit", 45, "Male", "Sales", 2012, 95000),
                new Employee(104, "Neha", 26, "Female", "IT", 2020, 58000),
                new Employee(105, "Vikram", 38, "Male", "Product Development", 2010, 120000),
                new Employee(106, "Sneha", 29, "Female", "Sales", 2017, 68000),
                new Employee(107, "Rahul", 41, "Male", "Finance", 2008, 110000),
                new Employee(108, "Anjali", 33, "Female", "Product Development", 2016, 92000),
                new Employee(109, "Karan", 27, "Male", "HR", 2019, 55000),
                new Employee(110, "Pooja", 31, "Female", "IT", 2014, 78000)
        );

        // 1. How many male and female employees are there?
        System.out.println("1. Gender count:");
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(genderCount);

        // 2. Print the name of all departments
        System.out.println("\n2. All departments:");
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        // 3. Average age of male and female
        System.out.println("\n3. Average age by gender:");
        Map<String, Double> avgAgeByGender = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)
                ));
        System.out.println(avgAgeByGender);

        // 4 & 15. Highest paid employee
        System.out.println("\n4 & 15. Highest paid employee:");
        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        highestPaid.ifPresent(e -> System.out.println(e));

        // 5. Employees joined after 2015
        System.out.println("\n5. Joined after 2015:");
        employees.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);

        // 6. Count employees in each department
        System.out.println("\n6. Count by department:");
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countByDept);

        // 7. Average salary of each department
        System.out.println("\n7. Average salary by department:");
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(avgSalaryByDept);

        // 8. Youngest male in Product Development
        System.out.println("\n8. Youngest male in Product Development:");
        employees.stream()
                .filter(e -> "Male".equals(e.getGender()))
                .filter(e -> "Product Development".equals(e.getDepartment()))
                .min(Comparator.comparingInt(Employee::getAge))
                .ifPresent(System.out::println);

        // 9. Most working experience (earliest join year)
        System.out.println("\n9. Most experienced employee:");
        employees.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining))
                .ifPresent(e -> System.out.println(e.getName() + " (" + e.getYearOfJoining() + ")"));

        // 10. Male and female in Sales team
        System.out.println("\n10. Gender count in Sales:");
        Map<String, Long> salesGender = employees.stream()
                .filter(e -> "Sales".equals(e.getDepartment()))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(salesGender);

        // 11. Average salary of male and female
        System.out.println("\n11. Average salary by gender:");
        Map<String, Double> avgSalaryByGender = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(avgSalaryByGender);

        // 12. Names of employees in each department
        System.out.println("\n12. Employees by department:");
        Map<String, List<String>> namesByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
        namesByDept.forEach((dept, names) ->
                System.out.println(dept + " - " + names));

        // 13. Average and total salary of whole organization
        System.out.println("\n13. Organization salary stats:");
        DoubleSummaryStatistics stats = employees.stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();
        System.out.println("Average salary: " + String.format("%.2f", stats.getAverage()));
        System.out.println("Total salary  : " + String.format("%.2f", stats.getSum()));

        // 14. Employees with salary > 25,000
        System.out.println("\n14. Employees with salary > 25k:");
        employees.stream()
                .filter(e -> e.getSalary() > 25000)
                .map(e -> e.getName() + " - " + e.getSalary())
                .forEach(System.out::println);

        // 16. Second highest paid
        System.out.println("\n16. Second highest paid:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // 17. Third highest paid
        System.out.println("\n17. Third highest paid:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);

        // 18. Lowest paid
        System.out.println("\n18. Lowest paid employee:");
        employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(System.out::println);

        // 19. Second lowest paid
        System.out.println("\n19. Second lowest paid:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // 20. First 5 lowest paid
        System.out.println("\n20. Top 5 lowest paid:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .limit(5)
                .forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));

        // 21. First 5 highest paid
        System.out.println("\n21. Top 5 highest paid:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(5)
                .forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
    }
}