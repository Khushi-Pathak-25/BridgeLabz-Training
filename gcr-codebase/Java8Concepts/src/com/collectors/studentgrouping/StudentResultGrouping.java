package com.collectors.studentgrouping;

import java.util.*;
import java.util.stream.Collectors;
public class StudentResultGrouping {
	
    public static void main(String[] args) {

        // Student list
        List<Student> students = Arrays.asList(
                new Student("Khushi", "A"),
                new Student("Aman", "B"),
                new Student("Riya", "A"),
                new Student("Neha", "C"),
                new Student("Rahul", "B")
        );

        // Group students by grade and collect names
        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        // Print result
        System.out.println("Student Result Grouping:");
        result.forEach((grade, names) ->
                System.out.println(grade + " -> " + names)
        );
    }
}