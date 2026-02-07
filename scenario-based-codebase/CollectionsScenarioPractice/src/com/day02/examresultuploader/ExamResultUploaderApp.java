/*
9. ExamResultUploader – Bulk Marks Processing
Story: A school system uploads student marks as .csv files:
RollNo,Name,Subject,Marks
101,Ravi,Math,95
102,Anita,Science,88
The ExamResultUploader tool must:
● Read the file using FileReader and BufferedReader
● Validate each line with Regex (no missing fields, correct marks format)
● Use Map<String, List<Integer>> to store subject-wise marks
● Calculate top scorer per subject using PriorityQueue
● Use Generics to allow support for mid-term, finals, or internal exams
● Throw custom exceptions for invalid formats or missing marks
*/

package com.day02.examresultuploader;

import java.io.IOException;

public class ExamResultUploaderApp {
	public static void main(String[] args) {
		ExamResultUploader<Object> uploader = new ExamResultUploader<>();

		// sample file path
		String csvFile = "samplefiles/marks.csv";

		try {
			uploader.uploadResults(csvFile);
			uploader.showTopScorers();
			uploader.showSummary();

		} catch (InvalidMarksException e) {
			System.out.println("Validation Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("File Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}
}