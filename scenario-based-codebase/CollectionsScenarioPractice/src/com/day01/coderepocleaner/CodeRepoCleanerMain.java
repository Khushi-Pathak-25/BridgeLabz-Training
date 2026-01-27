/*
 4. CodeRepoCleaner – Java File Scanner and Organizer
Story: In a developer team, thousands of Java source files are dumped into a shared folder.
Over time, many have become redundant, duplicate, or poorly formatted.
The tool CodeRepoCleaner should:
● Scan all .java files in nested folders using I/O
● Use regex to detect:
○ Methods not following naming conventions
○ Unused import statements
● Categorize files into folders (Valid, Warnings, Errors)
● Use List<Path>, Map<FileType, List<File>>, and Set<String> to manage file types
● Allow filtering files based on size, date modified, etc. using streams
*/

package com.day01.coderepocleaner;

import java.io.IOException;

public class CodeRepoCleanerMain {
    public static void main(String[] args) {
        CodeRepoCleaner cleaner = new CodeRepoCleaner();

        // sample repo path
        String sourceFolder = "samplefiles/myrepo";
        String outputBase = "samplefiles/myrepocleaned";

        try {
            cleaner.cleanRepo(sourceFolder, outputBase);

            // examples of filtering
            // List<Path> large = cleaner.getLargeFiles(sourceFolder, 100 * 1024); // >100KB
            // List<Path> recent = cleaner.getRecentFiles(sourceFolder, 7); // last 7 days

            // System.out.println("Large files: " + large.size());
            // System.out.println("Recent files: " + recent.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}