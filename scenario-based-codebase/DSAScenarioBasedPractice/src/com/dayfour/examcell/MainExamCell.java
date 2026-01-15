/*5. ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data*/

package com.dayfour.examcell;

public class MainExamCell {

	public static void main(String[] args) {

		Student[] students = { new Student("Aman", 85), new Student("Pawan", 92), new Student("Krishav", 78),
				new Student("Mehul", 92), new Student("Prerna", 88) };

		MergeSortRanks.mergeSort(students, 0, students.length - 1);

		System.out.println("State Level Rank List:");
		for (Student s : students) {
			s.display();
		}
	}
}
