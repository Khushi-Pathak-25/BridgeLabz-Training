/*1. Singly Linked List: Student Record Management
Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes.*/

package com.linkedlists.singly.studentrecordmanagement;


public class MainStudentRecordApp {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(111, "Khushi", 22, 'A');     // index 0
        list.addAtEnd(112, "Shagun", 21, 'B');          // index 1
        list.addAtEnd(113, "Pawan", 19, 'C');          // index 2

        list.addAtPosition(1, 114, "Aman", 16, 'A');  // insert at index 1

        System.out.println("All Student Records:");
        list.displayAll();

        System.out.println("Searching Roll No 112:");
        list.searchByRollNumber(112);
        System.out.println("----------------------------");
        
        System.out.println("Updating Grade for Roll No 113:");
        list.updateGrade(113, 'B');
        System.out.println("----------------------------");

        System.out.println("Deleting Roll No 111:");
        list.deleteByRollNumber(111);
        System.out.println("----------------------------");

        System.out.println("Final Student Records:");
        list.displayAll();
    }
}