package com.lambdas.employee;

import java.util.*;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class EmployeeLambdas {

	static class Employee {
		String name;
		double salary;
		int experienceYears;

		public Employee(String name, double salary, int experienceYears) {
			this.name = name;
			this.salary = salary;
			this.experienceYears = experienceYears;
		}

		@Override
		public String toString() {
			return "Employee{name='" + name + "', salary=" + salary + ", exp=" + experienceYears + "}";
		}
	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Richa", 45000, 5), new Employee("Prerna", 35000, 2),
				new Employee("Aneeta", 75000, 8), new Employee("Neha", 54000, 4), new Employee("Veena", 29000, 1));

		// 1. Bonus calculation (10% if salary > 30,000)
		Function<Employee, Double> bonus = emp -> emp.salary > 30000 ? emp.salary * 0.10 : 0;
		System.out.println("1. Bonus calculation:");
		employees.forEach(e -> System.out.println(e.name + " ==> Bonus = " + bonus.apply(e)));

		// 2. Sort by salary
		System.out.println("\n2. Sorted by salary:");
		employees.stream().sorted(Comparator.comparingDouble(e -> e.salary)).forEach(System.out::println);

		// 3. Promotion eligibility (> 3 years)
		Predicate<Employee> eligibleForPromotion = e -> e.experienceYears > 3;
		System.out.println("\n3. Promotion eligible:");
		employees.forEach(e -> System.out.println(e.name + " ==> " + (eligibleForPromotion.test(e) ? "Yes" : "No")));

		// 4. Print details using lambda
		Consumer<Employee> printDetails = e -> System.out
				.println("Name: " + e.name + ", Salary: " + e.salary + ", Exp: " + e.experienceYears);
		System.out.println("\n4. Employee details:");
		employees.forEach(printDetails);

		// 5. Compare two employees' salaries
		BiConsumer<Employee, Employee> compareSalary = (e1, e2) -> {
			if (e1.salary > e2.salary) {
				System.out.println(e1.name + " earns more than " + e2.name);
			} else if (e1.salary < e2.salary) {
				System.out.println(e2.name + " earns more than " + e1.name);
			} else {
				System.out.println("Both earn the same.");
			}
		};
		System.out.println("\n5. Salary comparison:");
		compareSalary.accept(employees.get(0), employees.get(1));
	}

}
