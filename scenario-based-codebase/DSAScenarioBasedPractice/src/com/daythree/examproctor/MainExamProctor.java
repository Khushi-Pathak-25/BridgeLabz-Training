/*11. ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.*/

package com.daythree.examproctor;

public class MainExamProctor {

    public static void main(String[] args) {

        QuestionStack navigation = new QuestionStack();
        ExamAnswerMap answers = new ExamAnswerMap();

        // Student navigation
        navigation.visitQuestion(1);
        answers.saveAnswer(1, "A");

        navigation.visitQuestion(2);
        answers.saveAnswer(2, "B");

        navigation.visitQuestion(3);
        answers.saveAnswer(3, "D");

        // Student submits exam
        int finalScore = ExamEvaluator.calculateScore(answers.getAnswers());

        System.out.println("Final Score: " + finalScore);
        System.out.println("Last Visited Question: " + navigation.currentQuestion());
    }
}
