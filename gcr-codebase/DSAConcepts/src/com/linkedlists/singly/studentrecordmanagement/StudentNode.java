package com.linkedlists.singly.studentrecordmanagement;

public class StudentNode {
	
	int rollNumber;
    String name;
    int age;
    char grade;
    StudentNode next;
    
	public StudentNode(int rollNumber, String name, int age, char grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
    
}
