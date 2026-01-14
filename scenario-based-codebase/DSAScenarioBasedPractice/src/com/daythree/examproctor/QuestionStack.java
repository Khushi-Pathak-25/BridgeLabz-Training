package com.daythree.examproctor;

public class QuestionStack {

    private int top = -1;
    private int[] stack = new int[10];

    // Push question ID
    public void visitQuestion(int questionId) {
        stack[++top] = questionId;
    }

    // Pop last visited question
    public int goBack() {
        if (top == -1) {
            return -1;
        }
        return stack[top--];
    }

    // Peek current question
    public int currentQuestion() {
        if (top == -1) return -1;
        return stack[top];
    }
}
