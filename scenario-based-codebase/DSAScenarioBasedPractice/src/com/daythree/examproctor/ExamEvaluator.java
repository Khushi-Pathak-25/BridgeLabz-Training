package com.daythree.examproctor;

import java.util.HashMap;

public class ExamEvaluator {

    public static int calculateScore(HashMap<Integer, String> studentAnswers) {

        // Correct answers
        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        int score = 0;

        for (int qid : correctAnswers.keySet()) {
            if (correctAnswers.get(qid).equals(studentAnswers.get(qid))) {
                score++;
            }
        }
        return score;
    }
}
