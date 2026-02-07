package com.optionaldemo.student;

import java.util.Optional;

public class StudentManagement {

	static class Student {
		private String name;
		private String email;
		private String phone;
		private String address;
		private String nickname;

		public Student(String name, String email, String phone, String address, String nickname) {
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
			this.nickname = nickname;
		}

		public Optional<String> getEmail() {
			return Optional.ofNullable(email);
		}

		public Optional<String> getPhone() {
			return Optional.ofNullable(phone);
		}

		public Optional<String> getAddress() {
			return Optional.ofNullable(address);
		}

		public Optional<String> getNickname() {
			return Optional.ofNullable(nickname);
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {

		Student s1 = new Student("Aashima Rao", "aashimarao@email.com", null, "Mumbai", "Aashi");
		Student s2 = new Student("Nitin Kumar", null, "9876558810", null, null);

		// 1. Safely fetch email
		System.out.println("1. Email:");
		s1.getEmail().ifPresentOrElse(email -> System.out.println("Email: " + email),
				() -> System.out.println("No email provided"));
		s2.getEmail().ifPresentOrElse(email -> System.out.println("Email: " + email),
				() -> System.out.println("No email provided"));

		// 2. Default phone number if missing
		System.out.println("\n2. Phone with default:");
		String phone = s1.getPhone().orElse("Not registered");
		System.out.println(s1.getName() + " ==> " + phone);
		phone = s2.getPhone().orElse("Not registered");
		System.out.println(s2.getName() + " ==> " + phone);

		// 3. Find student by ID simulation
		System.out.println("\n3. Find student by ID:");
		Optional<Student> found = findStudentById(112); // not found
		String result = found.map(Student::getName).orElse("Student not available");
		System.out.println(result);

		// 4. Safe address fetch
		System.out.println("\n4. Address:");
		String addr = s2.getAddress().orElse("Address not available");
		System.out.println(s2.getName() + " ==> " + addr);

		// 5. Nickname or real name
		System.out.println("\n5. Nickname / Real name:");
		String displayName = s1.getNickname().orElse(s1.getName());
		System.out.println("Display name: " + displayName);

		displayName = s2.getNickname().orElse(s2.getName());
		System.out.println("Display name: " + displayName);
	}

	private static Optional<Student> findStudentById(int id) {
		 return Optional.empty(); // not found
	}
}