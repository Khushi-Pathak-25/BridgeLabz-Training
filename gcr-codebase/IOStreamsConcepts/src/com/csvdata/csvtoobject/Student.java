package com.csvdata.csvtoobject;

public class Student {
    private int id;
    private String name;
    private int age;
    private int marks;

    // constructor
    public Student(int id, String name, int age, int marks) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.marks = marks;
    }

    // getters & setters
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public int getMarks() {
	return marks;
    }

    public void setMarks(int marks) {
	this.marks = marks;
    }

    // good string representation
    @Override
    public String toString() {
	return "Student{id=" + id + ", name='" + name + '\'' + ", age=" + age + ", marks=" + marks + '}';
    }
}