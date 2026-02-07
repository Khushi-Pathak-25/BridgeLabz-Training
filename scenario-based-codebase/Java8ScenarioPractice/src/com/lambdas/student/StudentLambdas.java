package com.lambdas.student;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentLambdas {

	static class Student {

		String name;
		int age;
		int marks;
		int rank;

		public Student(String name, int age, int marks, int rank) {
			this.name = name;
			this.age = age;
			this.marks = marks;
			this.rank = rank;
		}

		@Override
		public String toString() {
			return "Student{name='" + name + "', age= " + age + ", marks=" + marks + ", rank=" + rank + "}";
		}

	}

	// main method
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student("Khushi", 22, 93, 12), new Student("Shagun", 21, 95, 1),
				new Student("Pawan", 26, 86, 15), new Student("Aman", 16, 98, 10));

		// welcome message to all students
		Consumer<Student> welcome = s -> System.out.println("Welcome " + s.name);
		System.out.println("-----------Welcome Message----------");
		list.forEach(welcome);

		// pass/fail
		Predicate<Student> marks = s -> s.marks >= 60;

		System.out.println("------------ Pass/Fail status -----------");
		list.forEach(s -> System.out.println(s.name + " ==> " + (marks.test(s) ? "Pass" : "Fail")));

		// sort by name
		System.out.println("---------  Sorted by name --------------");
		list.stream().sorted(Comparator.comparing(s -> s.name)).forEach(System.out::println);

		// Age > 18
		System.out.println("-------- Students above 18 years ------");
		list.stream().filter(s -> s.age > 18).forEach(System.out::println);

	}
}
