/*1. Binary Search Tree (BST)
Story: University's Digital Record System
The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
details.
● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll
numbers for attendance.
*/

package com.daynine.universitydigitalrecord;

public class UniversityDigitalRecord {
	
	 public static void main(String[] args) {

	        StudentBST bst = new StudentBST();

	        bst.root = bst.insert(bst.root, 50);
	        bst.insert(bst.root, 30);
	        bst.insert(bst.root, 70);
	        bst.insert(bst.root, 20);
	        bst.insert(bst.root, 40);

	        System.out.print("Sorted Roll Numbers: ");
	        bst.inorder(bst.root);

	        System.out.println("\nSearch Roll 40: " + bst.search(bst.root, 40));
	    }

}
