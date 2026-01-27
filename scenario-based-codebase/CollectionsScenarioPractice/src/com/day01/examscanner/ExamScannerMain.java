/*
5. ExamScanner – Digital Answer Sheet Validator
Story: In a school, multiple-choice answer sheets are scanned and saved as .csv files. Each
line looks like:
John Doe,A,B,C,D,A,B,C
ExamScanner should:
● Read each line and parse student answers using BufferedReader
● Compare answers with a provided answer key
● Use Generics to work with different subject types (MathAnswerSheet,
ScienceAnswerSheet)
● Use Map<StudentName, Score>, and sort results using a PriorityQueue
● Detect formatting issues using Regex (e.g., extra/missing commas, invalid options)
*/

package com.day01.examscanner;

public class ExamScannerMain {
    public static void main(String[] args) {
        // choose subject
        MathAnswerSheet mathKey = new MathAnswerSheet();
        ExamScanner<MathAnswerSheet> mathScanner = new ExamScanner<>(mathKey);

        // change to your actual file path
        String csvFile = "samplefiles/mathanswers.csv";

        System.out.println("Processing Math exam answers...");
        mathScanner.processFile(csvFile);
        mathScanner.showResults();

        // example for another subject
         ScienceAnswerSheet scienceKey = new ScienceAnswerSheet();
         ExamScanner<ScienceAnswerSheet> scienceScanner = new ExamScanner<>(scienceKey);
         scienceScanner.processFile("samplefiles/scienceanswers.csv");
         scienceScanner.showResults();
    }
}