/*3. Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different 
evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.
*/

package com.generics.universitycoursesystem;

import java.util.ArrayList;
import java.util.List;

public class UniversityCourseManagementApp {

	public static void main(String[] args) {

		// Creating courses with different evaluation types
		Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());

		Course<AssignmentCourse> software = new Course<>("Software Engineering", new AssignmentCourse());

		Course<ResearchCourse> ai = new Course<>("Artificial Intelligence", new ResearchCourse());

		// Display individual courses
		math.displayCourse();
		software.displayCourse();
		ai.displayCourse();

		// List containing different course types
		List<CourseType> allCourses = new ArrayList<>();
		allCourses.add(new ExamCourse());
		allCourses.add(new AssignmentCourse());
		allCourses.add(new ResearchCourse());

		// Display all courses using wildcard method
		CourseUtil.displayAllCourses(allCourses);
	}
}
