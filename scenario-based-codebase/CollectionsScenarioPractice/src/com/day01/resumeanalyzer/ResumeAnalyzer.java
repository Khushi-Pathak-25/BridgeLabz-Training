package com.day01.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {
	// store by email
	private Map<String, ResumeData> candidatesByEmail;
	
	// sorted list for display
	private List<ResumeData> sortedList;

	public ResumeAnalyzer() {
		candidatesByEmail = new HashMap<>();
		sortedList = new ArrayList<>();
	}

	// read folder and process text files
	public void processFolder(String folderPath) {
		File folder = new File(folderPath);
		File[] files = folder.listFiles();

		if (files == null) {
			System.out.println("Folder not found or empty");
			return;
		}

		for (File file : files) {
			if (!file.isFile() || !file.getName().toLowerCase().endsWith(".txt")) {
				continue;
			}

			try {
				String text = readFile(file);
				String email = findEmail(text);
				if (email == null) {
					throw new InvalidFormatException("no email found");
				}

				String phone = findPhone(text);
				int count = countSkills(text);

				ResumeData data = new ResumeData(email, phone, count, file.getName());

				// store in map (email is key)
				candidatesByEmail.put(email, data);

			} catch (Exception e) {
				System.out.println("Skipped: " + file.getName() + " -> " + e.getMessage());
			}
		}

		// fill list and sort by match count (highest first)
		sortedList.addAll(candidatesByEmail.values());
		sortedList.sort((a, b) -> b.getMatchCount() - a.getMatchCount());
	}

	// read whole text file
	private String readFile(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
		}
		return sb.toString();
	}

	// find first email
	private String findEmail(String text) {
		Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		Matcher m = p.matcher(text);
		return m.find() ? m.group() : null;
	}

	// find first phone-like number
	private String findPhone(String text) {
		Pattern p = Pattern.compile("\\+?\\d[\\d\\s-]{8,12}\\d");
		Matcher m = p.matcher(text);
		return m.find() ? m.group() : "not found";
	}

	// count important words (case insensitive)
	private int countSkills(String text) {
		Pattern p = Pattern.compile("\\b(java|python|spring)\\b", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		int count = 0;
		while (m.find()) {
			count++;
		}
		return count;
	}

	// show result
	public void showResults() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Email                | Phone           | Matches | File name");
		System.out.println("----------------------------------------------------------------------------");

		for (ResumeData d : sortedList) {
			System.out.println(d);
		}

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Total valid resumes: " + sortedList.size());
	}
}