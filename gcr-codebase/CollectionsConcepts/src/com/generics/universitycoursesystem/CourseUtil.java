package com.generics.universitycoursesystem;

import java.util.List;

public class CourseUtil {

	// Wildcard method to accept any CourseType list
	public static void displayAllCourses(List<? extends CourseType> courseTypes) {

		for (CourseType type : courseTypes) {
			type.evaluate();
		}
	}
}
