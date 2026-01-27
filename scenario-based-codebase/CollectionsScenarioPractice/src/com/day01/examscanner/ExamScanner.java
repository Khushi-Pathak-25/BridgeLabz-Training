package com.day01.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner<T extends AnswerSheet> {
    private final T answerKey;
    private final Map<String, Integer> studentScores;

    // constructor
    public ExamScanner(T answerKey) {
        this.answerKey = answerKey;
        this.studentScores = new HashMap<>();
    }

    // read and process one csv file
    public void processFile(String filePath) {
    	// name + at least 4 answers A/B/C/D
        Pattern validLine = Pattern.compile("^[^,]+(,[A-D]){4,}$");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                lineNumber++;

                if (line.isEmpty()) continue;

                // check format with regex
                Matcher matcher = validLine.matcher(line);
                if (!matcher.matches()) {
                    System.out.println("Invalid format at line " + lineNumber + ": " + line);
                    continue;
                }

                // split in Strings
                String[] parts = line.split(",");
                if (parts.length < 5) {
                	// name + at least 4 answers
                    System.out.println("Too few answers at line " + lineNumber);
                    continue;
                }

                String studentName = parts[0].trim();
                String[] answers = new String[parts.length - 1];
                for (int i = 1; i < parts.length; i++) {
                    answers[i - 1] = parts[i].trim().toUpperCase();
                }

                // calculate score
                int score = calculateScore(answers);
                studentScores.put(studentName, score);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // compare student answers with key
    private int calculateScore(String[] studentAnswers) {
        String[] correct = answerKey.getCorrectAnswers();
        int score = 0;
        int maxQuestions = Math.min(studentAnswers.length, correct.length);

        for (int i = 0; i < maxQuestions; i++) {
            if (studentAnswers[i].equals(correct[i])) {
                score++;
            }
        }
        return score;
    }

    // show results using PriorityQueue (top scorers first)
    public void showResults() {
        // priority queue: highest score first
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
        		// descending score
                (a, b) -> b.getValue() - a.getValue()
        );

        pq.addAll(studentScores.entrySet());

        System.out.println("Results for " + answerKey.getSubjectName() + " Exam");
        System.out.println("-----------------------------------------------");
        System.out.println("Student Name          | Score");
        System.out.println("-----------------------------------------------");

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.printf("%-22s | %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Total students: " + studentScores.size());
        System.out.println();
    }
}