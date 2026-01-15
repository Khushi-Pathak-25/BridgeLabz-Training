package com.dayfour.examcell;

public class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void display() {
        System.out.println(name + " : " + score);
    }
}
