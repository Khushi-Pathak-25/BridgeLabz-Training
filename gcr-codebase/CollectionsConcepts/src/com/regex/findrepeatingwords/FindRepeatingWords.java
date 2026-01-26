/**
      * Word boundary (start)              - \b
      * Capture a word (letters/digits/_)  - (\w+)
      * One or more whitespace characters  - \s+
      * Backreference to first word        - \1
      * Word boundary (end)                - \b
      */
package com.regex.findrepeatingwords;

import java.util.regex.*;

public class FindRepeatingWords {

	public static void main(String[] args) {
		String text = "This is is a repeated repeated word test.";

		Matcher matcher = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);

		while (matcher.find()) {
			System.out.print(matcher.group(1)+", ");
		}
	}
}