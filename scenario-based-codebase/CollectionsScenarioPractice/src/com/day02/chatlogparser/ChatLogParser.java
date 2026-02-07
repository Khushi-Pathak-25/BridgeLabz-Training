package com.day02.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {
	
	// user -> list of their messages (TreeMap for alphabetical sorting)
	private Map<String, List<String>> userMessages;

	public ChatLogParser() {
		// TreeMap sorts keys alphabetically
		userMessages = new TreeMap<>();
	}

	// read log file and parse
	public void parseLogFile(String filePath, MessageFilter<String> filter) throws IOException {
		
		// regex: [HH:MM [AM/PM]] User: message
		Pattern pattern = Pattern.compile("\\[(\\d{1,2}:\\d{2} [AP]M)\\]\\s+([^:]+):\\s+(.+)");

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.isEmpty())
					continue;

				Matcher matcher = pattern.matcher(line);
				if (matcher.matches()) {
					String timestamp = matcher.group(1);
					String user = matcher.group(2).trim();
					String message = matcher.group(3).trim();

					// apply filter (skip idle messages)
					if (!filter.shouldKeep(message)) {
						continue;
					}

					// add to user's list
					userMessages.computeIfAbsent(user, _ -> new ArrayList<>()).add("[" + timestamp + "] " + message);
				} else {
					System.out.println("Skipped invalid line: " + line);
				}
			}
		}
	}

	// show all users and their messages (sorted by username)
	public void printSummary() {
		if (userMessages.isEmpty()) {
			System.out.println("No valid messages found.");
			return;
		}

		System.out.println("\nChat Log Summary (sorted by user name)");
		System.out.println("--------------------------------------------------------------------");

		for (Map.Entry<String, List<String>> entry : userMessages.entrySet()) {
			String user = entry.getKey();
			List<String> messages = entry.getValue();

			System.out.println(user + " (" + messages.size() + " productive messages):");
			for (String msg : messages) {
				System.out.println("  " + msg);
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total users: " + userMessages.size());
	}

	// get number of messages for a user
	public int getMessageCount(String user) {
		return userMessages.getOrDefault(user, new ArrayList<>()).size();
	}
}