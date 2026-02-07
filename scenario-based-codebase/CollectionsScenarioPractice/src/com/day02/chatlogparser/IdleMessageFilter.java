package com.day02.chatlogparser;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

// filter to remove idle / non-productive chat
public class IdleMessageFilter implements MessageFilter<String> {

	private static final Set<String> IDLE_KEYWORDS = new HashSet<>(
			Arrays.asList("lol", "haha", "brb", "gtg", "ok", "kk", "xd", "lmao", "rofl", "ty", "np", "gm", "gn"));

	@Override
	public boolean shouldKeep(String message) {
		String lower = message.toLowerCase().trim();

		// remove very short messages or exact idle words
		if (lower.length() < 5 || IDLE_KEYWORDS.contains(lower)) {
			return false;
		}

		// remove messages that are just idle words + punctuation
		for (String word : IDLE_KEYWORDS) {
			if (lower.contains(word)) {
				return false;
			}
		}

		return true;
	}
}