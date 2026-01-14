package com.daythree.examproctor;

import java.util.HashMap;

public class ExamAnswerMap {

    private HashMap<Integer, String> answerMap = new HashMap<>();

    public void saveAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
    }

    public HashMap<Integer, String> getAnswers() {
        return answerMap;
    }
}

