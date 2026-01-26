/**
 * First pattern	- [a-zA-Z0-9._%+-]+
 * Fixed character 	- @
 * Second pattern	- [a-zA-Z0-9.-]+
 * Fixed character	- .     		"\\." used escape character 
 * Last pattern		- [a-zA-Z]{2,}
 */
package com.regex.extractemails;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractEmails {

	public static void main(String[] args) {
		String text = "Contact us at support@example.com and info@company.org";

		Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}