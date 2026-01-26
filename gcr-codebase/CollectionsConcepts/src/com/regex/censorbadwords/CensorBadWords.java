/**
        * Word boundary (start)      - \b
        * Alternation (OR) group     - (damn|stupid)
        * Word boundary (end)        - \b
        */
package com.regex.censorbadwords;

public class CensorBadWords {
	public static void main(String[] args) {
		String text = "This is a damn bad example with some stupid words.";

		String regex = "\\b(damn|stupid)\\b";

		System.out.println(text.replaceAll(regex, "****"));
	}
}