package com.day01.examscanner;

// example for Science subject
public class ScienceAnswerSheet implements AnswerSheet {
    private static final String[] CORRECT = {"B", "A", "C", "D", "B"};

    @Override
    public String getSubjectName() {
        return "Science";
    }

    @Override
    public String[] getCorrectAnswers() {
        return CORRECT;
    }
}