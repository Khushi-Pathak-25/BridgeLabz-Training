package com.day01.examscanner;

// example for Math subject
public class MathAnswerSheet implements AnswerSheet {
    private static final String[] CORRECT = {"A", "B", "C", "D", "A"};

    @Override
    public String getSubjectName() {
        return "Mathematics";
    }

    @Override
    public String[] getCorrectAnswers() {
        return CORRECT;
    }
}