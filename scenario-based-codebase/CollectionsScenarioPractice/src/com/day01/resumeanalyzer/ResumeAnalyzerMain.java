/*1. ResumeAnalyzer – Smart Resume Filtering System
Story: At HireRight Technologies, HRs receive hundreds of resumes daily. An automated
system called ResumeAnalyzer is being developed to process .txt and .pdf resumes stored
in a folder.
The goal is to read each resume (using I/O Streams), extract contact details (email, phone)
using Regex, and index them into a Map<String, ResumeData>, where the key is the
candidate's email.
The system should support:
● Reading resumes from a folder
● Extracting keywords (Java, Python, Spring) using regex
● Storing candidates in a list sorted by keyword match count
● Skipping resumes with invalid formats using exception handling
*/

package com.day01.resumeanalyzer;

public class ResumeAnalyzerMain {

    public static void main(String[] args) {
    	System.out.println("============================================================================");
    	System.out.println("                 RESUME ANALYZER");
    	System.out.println("============================================================================");
        ResumeAnalyzer analyzer = new ResumeAnalyzer();

        String folder = "samplefiles";

        analyzer.processFolder(folder);
        analyzer.showResults();
        System.out.println("============================================================================");
    }
}