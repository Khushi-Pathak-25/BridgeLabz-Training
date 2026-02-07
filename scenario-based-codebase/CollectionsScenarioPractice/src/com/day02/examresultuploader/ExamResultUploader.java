package com.day02.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

	// subject -> list of marks
	private Map<String, List<Integer>> marksBySubject;

	// constructor
	public ExamResultUploader() {
		marksBySubject = new HashMap<>();
	}

	// read CSV and process marks
	@SuppressWarnings("unused")
	public void uploadResults(String filePath) throws IOException, InvalidMarksException {
		// regex: RollNo,Name,Subject,Marks (marks = 0-100)
		Pattern validLine = Pattern.compile("^\\d+,[^,]+,[^,]+,\\d{1,3}$");

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int lineNum = 0;

			while ((line = br.readLine()) != null) {
				line = line.trim();
				lineNum++;

				if (line.isEmpty() || line.startsWith("RollNo")) {
					continue;
				}

				Matcher matcher = validLine.matcher(line);
				if (!matcher.matches()) {
					throw new InvalidMarksException("Invalid format at line " + lineNum + ": " + line);
				}

				String[] parts = line.split(",");
				String rollNo = parts[0].trim();
				String name = parts[1].trim();
				String subject = parts[2].trim();
				String marksStr = parts[3].trim();

				int marks;
				try {
					marks = Integer.parseInt(marksStr);
					if (marks < 0 || marks > 100) {
						throw new InvalidMarksException("Marks out of range (0-100) at line " + lineNum);
					}
				} catch (NumberFormatException e) {
					throw new InvalidMarksException("Invalid marks value at line " + lineNum);
				}

				// store subject-wise marks
				marksBySubject.computeIfAbsent(subject, _ -> new ArrayList<>()).add(marks);
			}
		}
	}

	// show top scorer per subject using PriorityQueue
	public void showTopScorers() {
		System.out.println("Top Scorer per Subject");
		System.out.println("---------------------------------------------------------------");

		for (Map.Entry<String, List<Integer>> entry : marksBySubject.entrySet()) {
			String subject = entry.getKey();
			List<Integer> marksList = entry.getValue();

			if (marksList.isEmpty())
				continue;

			// PriorityQueue (max-heap) to find highest mark
			PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
			pq.addAll(marksList);

			int topScore = pq.poll(); // highest
			System.out.println(subject + ": " + topScore + " / 100");
		}
		System.out.println("---------------------------------------------------------------");
	}

	// show summary (average per subject)
	public void showSummary() {
		System.out.println("\nSubject-wise Summary:");
		System.out.println("---------------------------------------------------------------");

		for (Map.Entry<String, List<Integer>> entry : marksBySubject.entrySet()) {
			String subject = entry.getKey();
			List<Integer> marks = entry.getValue();

			if (marks.isEmpty())
				continue;

			double avg = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);

			System.out.printf("%s: %d students, Average = %.2f%n", subject, marks.size(), avg);
		}
		System.out.println("---------------------------------------------------------------");
	}
}