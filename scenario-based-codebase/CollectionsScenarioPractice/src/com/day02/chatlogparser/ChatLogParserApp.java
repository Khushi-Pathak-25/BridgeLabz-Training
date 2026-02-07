/*
 7. ChatLogParser – Messaging Pattern Analyzer
Story: A company wants to analyze employee chat logs for productivity. The logs are stored in
plain text files like:
[12:02 PM] John: Hey, the build failed again!
[12:03 PM] Mary: I’ll check the Jenkins pipeline.
Your task is to build ChatLogParser, a tool that:
● Reads chat logs using BufferedReader
● Uses Regex to extract timestamp, user, and message
● Stores results in a Map<String, List<String>> (user → messages)
● Filters out “idle chat” based on keyword list ("lol", "brb", etc.)
● Uses TreeMap to automatically sort users alphabetically
● Supports generic filtering rules using interfaces like MessageFilter<T>
*/

package com.day02.chatlogparser;

public class ChatLogParserApp {
    public static void main(String[] args) {
        ChatLogParser parser = new ChatLogParser();

        // use idle filter
        MessageFilter<String> filter = new IdleMessageFilter();

        // sample file path
        String logFile = "samplefiles/chatlog.txt";

        try {
            parser.parseLogFile(logFile, filter);
            parser.printSummary();

            // example: check specific user
            System.out.println("Messages by John: " + parser.getMessageCount("John"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}