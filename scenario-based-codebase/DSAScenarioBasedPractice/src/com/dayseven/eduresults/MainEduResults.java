/*3. EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting*/

package com.dayseven.eduresults;

import java.util.Scanner;

public class MainEduResults {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------ Enter marks of Bhopal --------");
		System.out.print("Enter number of students in bhopal: ");
		int bplStudents = input.nextInt();
		
		double bplMarks[] = new double[bplStudents];
		System.out.print("Enter Sorted marks of bhopal students: ");
		for(int i =0 ; i<bplStudents; i++) {
		
			bplMarks[i]= input.nextDouble();
		}
		
		System.out.println("------------ Enter marks of Indore --------");
		System.out.print("Enter number of students in indore: ");
		int indoreStudents = input.nextInt();
		
		double indoreMarks[] = new double[indoreStudents];
		System.out.print("Enter Sorted marks of indore students: ");
		for(int i =0 ; i<indoreStudents; i++) {
		
			indoreMarks[i]= input.nextDouble();
		}
	
		double answer[]=EduResultsMergeSort.merge(bplMarks, indoreMarks);
		EduResultsMergeSort.display(answer);
	}

}
