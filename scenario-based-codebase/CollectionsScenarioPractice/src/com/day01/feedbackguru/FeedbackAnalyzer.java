package com.day01.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackAnalyzer<T> {
    // Map: category -> (list of feedback messages)
    private Map<FeedbackCategory, List<String>> categorizedFeedback;

    // constructor
    public FeedbackAnalyzer() {
        categorizedFeedback = new HashMap<>();
        // initialize empty lists for each category
        for (FeedbackCategory c : FeedbackCategory.values()) {
            categorizedFeedback.put(c, new ArrayList<>());
        }
    }

    // read all txt files in folder and process
    public void analyzeFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in folder");
            return;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                readFeedbackFile(file);
            }
        }
    }

    // read one file line by line
    private void readFeedbackFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                processLine(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
        }
    }

    // process single feedback line
    private void processLine(String line) {
        try {
            // find rating like 8/10 or 9/10
            Integer rating = extractRating(line);

            if (rating == null) {
                // no rating found -> treat as neutral
                addToCategory(FeedbackCategory.NEUTRAL, line);
                return;
            }

            // decide category based on rating
            FeedbackCategory category = getCategory(rating);
            addToCategory(category, line);

        } catch (Exception e) {
            // invalid line -> skip quietly or log
            System.out.println("Skipped invalid line: " + line);
        }
    }

    // find number like X/10 using regex
    private Integer extractRating(String line) {
        Pattern pattern = Pattern.compile("\\b(\\d{1,2})/10\\b");
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            try {
                int score = Integer.parseInt(matcher.group(1));
                if (score >= 0 && score <= 10) {
                    return score;
                }
            } catch (NumberFormatException e) {
            	// program continues
            }
        }
        return null;
    }

    // decide if positive, neutral, negative
    private FeedbackCategory getCategory(int rating) {
        if (rating >= 8) {
            return FeedbackCategory.POSITIVE;
        } else if (rating >= 5) {
            return FeedbackCategory.NEUTRAL;
        } else {
            return FeedbackCategory.NEGATIVE;
        }
    }

    // add feedback to correct list
    private void addToCategory(FeedbackCategory category, String feedback) {
        categorizedFeedback.get(category).add(feedback);
    }

    // show summary
    public void printSummary() {
    	System.out.println("--------------------------------------------------------------------------");
        System.out.println("Feedback Summary:");
        System.out.println("--------------------------------------------------------------------------");

        for (FeedbackCategory category : FeedbackCategory.values()) {
            List<String> list = categorizedFeedback.get(category);
            System.out.println(category + ": " + list.size() + " entries");

            // show first 3 examples (or all if less)
            int count = Math.min(3, list.size());
            for (int i = 0; i < count; i++) {
                System.out.println("  - " + list.get(i));
            }
            if (list.size() > 3) {
                System.out.println("  ... and " + (list.size() - 3) + " more");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    // get total feedback count
    public int getTotalFeedback() {
        int total = 0;
        for (List<String> list : categorizedFeedback.values()) {
            total += list.size();
        }
        return total;
    }
}