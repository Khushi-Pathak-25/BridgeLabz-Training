package com.linkedlists.singly.studentrecordmanagement;

public class StudentLinkedList {

    private StudentNode head;

    // Add student at start
    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add student at end
    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add student at specific position (0-based index)
    public void addAtPosition(int index, int roll, String name, int age, char grade) {

        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        // Move to (index - 1)th node
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete student by roll number
    public void deleteByRollNumber(int roll) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search student by roll number
    public void searchByRollNumber(int roll) {

        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by roll number
    public void updateGrade(int roll, char newGrade) {

        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all student records
    public void displayAll() {

        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode temp = head;
        int index = 0;

        while (temp != null) {
            System.out.println("Index   : " + index);
            displayStudent(temp);
            temp = temp.next;
            index++;
        }
    }

    // Method to display one student
    private void displayStudent(StudentNode node) {
        System.out.println("Roll No : " + node.rollNumber);
        System.out.println("Name    : " + node.name);
        System.out.println("Age     : " + node.age);
        System.out.println("Grade   : " + node.grade);
        System.out.println("----------------------");
    }
}