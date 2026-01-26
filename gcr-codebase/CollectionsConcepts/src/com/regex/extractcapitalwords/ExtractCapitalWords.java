/**
         * Start of a word boundary            - \b
         * Single uppercase alphabet character - [A-Z]
         * Zero or more lowercase characters   - [a-z]*
         * End of a word boundary              - \b
         */
package com.regex.extractcapitalwords;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractCapitalWords {

	public static void main(String[] args) {
		String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";

		Matcher matcher = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);

		while (matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
	}
}