package com.day01.resumeanalyzer;

// holds one candidate info
public class ResumeData {
	String email;
	String phone;
	int matchCount;
	String fileName;

	// constructor
	public ResumeData(String email, String phone, int matchCount, String fileName) {
		this.email = email;
		this.phone = phone;
		this.matchCount = matchCount;
		this.fileName = fileName;
	}

	// good string representation
	public String toString() {
		return email + " | " + phone + " | " + matchCount + "      | " + fileName;
	}

	public int getMatchCount() {
		return matchCount;
	}
}