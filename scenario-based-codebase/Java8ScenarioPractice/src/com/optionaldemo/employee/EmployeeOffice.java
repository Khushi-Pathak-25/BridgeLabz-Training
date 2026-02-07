package com.optionaldemo.employee;

import java.util.Optional;

public class EmployeeOffice {

	static class Employee {
		private String name;
		private Manager manager;
		private Double bonus; 
		private String middleName;
		private String insuranceNo;

		public Employee(String name, Manager manager, Double bonus, String middleName, String insuranceNo) {
			this.name = name;
			this.manager = manager;
			this.bonus = bonus;
			this.middleName = middleName;
			this.insuranceNo = insuranceNo;
		}

		public Optional<Manager> getManager() {
			return Optional.ofNullable(manager);
		}

		public Optional<Double> getBonus() {
			return Optional.ofNullable(bonus);
		}

		public Optional<String> getMiddleName() {
			return Optional.ofNullable(middleName);
		}

		public Optional<String> getInsuranceNo() {
			return Optional.ofNullable(insuranceNo);
		}

		public String getName() {
			return name;
		}
	}

	static class Manager {
		private String name;

		public Manager(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Mihir Shukla", new Manager("Nidhi Rajput"), 18000.0, null, "INS-784512");
		Employee e2 = new Employee("Seena Nagar", null, null, "Kumari", null);

		// 1. Manager details
		System.out.println("1. Manager:");
		e1.getManager().ifPresent(m -> System.out.println(e1.getName() + " -> Manager: " + m.getName()));
		e2.getManager().ifPresentOrElse(m -> System.out.println(e2.getName() + " -> Manager: " + m.getName()),
				() -> System.out.println(e2.getName() + " -> No manager (individual contributor)"));

		// 2. Bonus (default 0)
		System.out.println("\n2. Bonus:");
		double bonus1 = e1.getBonus().orElse(0.0);
		double bonus2 = e2.getBonus().orElse(0.0);
		System.out.println(e1.getName() + " -> " + bonus1);
		System.out.println(e2.getName() + " -> " + bonus2);

		// 3. Find by email → custom exception
		System.out.println("\n3. Find employee by email:");
		Optional<Employee> emp = findByEmail("shagun@gmail.com");
		try {			
			Employee found = emp.orElseThrow(() -> new RuntimeException("Employee not found with given email"));
		} catch(RuntimeException e) {
			System.out.println("RUNTIMEEXCEPTION: " + e.getMessage());
		}

		// 4. Insurance details
		System.out.println("\n4. Insurance:");
		String ins = e1.getInsuranceNo().orElse("No insurance enrolled");
		System.out.println(e1.getName() + " -> " + ins);

		// 5. Middle name only if present
		System.out.println("\n5. Middle name:");
		e1.getMiddleName().ifPresentOrElse(mn -> System.out.println(e1.getName() + " middle name: " + mn),
				() -> System.out.println(e1.getName() + " has no middle name"));
		e2.getMiddleName().ifPresent(System.out::println);
	}

	private static Optional<Employee> findByEmail(String email) {
		// return Optional.empty(); // not found
		return Optional.empty();
	}
}