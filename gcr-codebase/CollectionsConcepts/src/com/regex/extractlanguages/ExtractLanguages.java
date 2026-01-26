/*   * Word boundary (start)           - \b
     * Allowed language names          - (Java|Python|JavaScript|Go)
     * Word boundary (end)             - \b
     */
package com.regex.extractlanguages;

import java.util.regex.*;

public class ExtractLanguages {
	public static void main(String[] args) {
		String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

		Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);

		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}