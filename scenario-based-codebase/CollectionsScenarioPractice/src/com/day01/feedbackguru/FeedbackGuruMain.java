/*3. FeedbackGuru – Smart Survey Analyzer
Story: A retail chain collects feedback in plain .txt files where each line contains customer
feedback like:
"Service was amazing. Would rate 9/10. Will visit again."
They want to create a Java tool called FeedbackGuru that:
● Reads all .txt feedback files (IO)
● Uses regex to extract ratings (e.g., 7/10, 9/10)
● Groups feedback into categories (Positive, Neutral, Negative) using Map<String,
List<String>>`
● Uses Generics to allow flexible feedback types (e.g., Product, Service)
● Handles missing/invalid lines gracefully using exception handling
*/

package com.day01.feedbackguru;

public class FeedbackGuruMain {
	public static void main(String[] args) {
		// create analyzer (String as text)
		FeedbackAnalyzer<String> guru = new FeedbackAnalyzer<>();

		// folder path
		String feedbackFolder = "samplefiles/feedbackfiles";

		System.out.println("Analyzing feedback files...\n");
		guru.analyzeFolder(feedbackFolder);

		guru.printSummary();

		System.out.println("Total feedback entries processed: " + guru.getTotalFeedback());
	}
}