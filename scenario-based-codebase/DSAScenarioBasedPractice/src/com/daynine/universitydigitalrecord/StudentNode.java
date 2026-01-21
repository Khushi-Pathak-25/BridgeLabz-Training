package com.daynine.universitydigitalrecord;

public class StudentNode {
    int roll;
    StudentNode left, right;

    StudentNode(int roll) {
        this.roll = roll;
        left = right = null;
    }
}