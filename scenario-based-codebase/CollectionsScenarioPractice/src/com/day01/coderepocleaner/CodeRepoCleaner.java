package com.day01.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    // categories
    private static final String VALID = "Valid";
    private static final String WARNINGS = "Warnings";
    private static final String ERRORS = "Errors";

    // main method to start cleaning
    public void cleanRepo(String sourceFolder, String outputBase) throws IOException {
        Path src = Paths.get(sourceFolder);
        Path out = Paths.get(outputBase);

        // create category folders
        createCategoryFolders(out);

        // find all .java files recursively
        List<Path> javaFiles = Files.walk(src)
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().toLowerCase().endsWith(".java"))
                .collect(Collectors.toList());

        System.out.println("Found " + javaFiles.size() + " .java files");

        // process each file
        Map<String, List<Path>> categorized = new HashMap<>();
        categorized.put(VALID, new ArrayList<>());
        categorized.put(WARNINGS, new ArrayList<>());
        categorized.put(ERRORS, new ArrayList<>());

        Set<String> usedImports = new HashSet<>(); // just for demo

        for (Path file : javaFiles) {
            try {
                String content = Files.readString(file);

                int issueCount = 0;

                // check method names (simple regex - starts with lowercase)
                issueCount += checkMethodNames(content);

                // check unused imports (very basic - we just count imports)
                int importCount = countImports(content);
                if (importCount > 0) {
                    issueCount += checkUnusedImports(content);
                }

                // decide category
                String category;
                if (issueCount == 0) {
                    category = VALID;
                } else if (issueCount <= 2) {
                    category = WARNINGS;
                } else {
                    category = ERRORS;
                }

                categorized.get(category).add(file);

            } catch (Exception e) {
                System.out.println("Error reading " + file + ": " + e.getMessage());
                categorized.get(ERRORS).add(file);
            }
        }

        // move files to category folders
        moveFiles(categorized, out);

        // print summary
        printSummary(categorized);
    }

    // create output folders
    private void createCategoryFolders(Path base) throws IOException {
        for (String cat : new String[]{VALID, WARNINGS, ERRORS}) {
            Path dir = base.resolve(cat);
            Files.createDirectories(dir);
        }
    }

    // simple regex to find method names not starting with lowercase
    private int checkMethodNames(String content) {
        // looks for public/private void/int/... methodName(...
        Pattern p = Pattern.compile("(public|private|protected)\\s+(static\\s+)?\\w+\\s+([A-Z]\\w*)\\s*\\(");
        Matcher m = p.matcher(content);
        int bad = 0;
        while (m.find()) {
            bad++;
            System.out.println("Bad method name: " + m.group(3));
        }
        return bad;
    }

    // count total import lines
    private int countImports(String content) {
        Pattern p = Pattern.compile("^import\\s+.*;");
        return (int) content.lines().filter(line -> p.matcher(line.trim()).matches()).count();
    }

    // very basic unused imports check (just example - in real tool use AST)
    private int checkUnusedImports(String content) {
        // simplistic - assume if import has no usage (very rough)
        return 0; // placeholder - real implementation needs more logic
    }

    // move files to their category folder
    private void moveFiles(Map<String, List<Path>> categorized, Path base) throws IOException {
        for (Map.Entry<String, List<Path>> entry : categorized.entrySet()) {
            String cat = entry.getKey();
            List<Path> files = entry.getValue();

            Path targetDir = base.resolve(cat);

            for (Path src : files) {
                Path target = targetDir.resolve(src.getFileName());
                try {
                    Files.move(src, target, StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    System.out.println("Failed to move " + src + " to " + target);
                }
            }
        }
    }

    // print summary
    private void printSummary(Map<String, List<Path>> categorized) {
        System.out.println("\nSummary:");
        System.out.println("--------------------------------------------------------------------");
        for (String cat : new String[]{VALID, WARNINGS, ERRORS}) {
            System.out.println(cat + ": " + categorized.get(cat).size() + " files");
        }
        System.out.println("--------------------------------------------------------------------");
    }

    // bonus: filter files by size (example usage)
    public List<Path> getLargeFiles(String folder, long minBytes) throws IOException {
        return Files.walk(Paths.get(folder))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .filter(p -> {
                    try {
                        return Files.size(p) > minBytes;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    // bonus: filter by last modified date
    public List<Path> getRecentFiles(String folder, long daysAgo) throws IOException {
        long cutoff = System.currentTimeMillis() - (daysAgo * 24 * 60 * 60 * 1000);
        return Files.walk(Paths.get(folder))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .filter(p -> {
                    try {
                        return Files.getLastModifiedTime(p).toMillis() > cutoff;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}