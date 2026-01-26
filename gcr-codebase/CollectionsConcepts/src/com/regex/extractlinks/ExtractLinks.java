/**
         * Protocol (http or https)   	- https?
         * Protocol separator        	- ://
         * One or more non-space chars	- \S+
         */
package com.regex.extractlinks;

import java.util.regex.*;

public class ExtractLinks {
	public static void main(String[] args) {
		String text = "Visit https://www.google.com and http://example.org for more info.";

		Matcher matcher = Pattern.compile("https?://\\S+").matcher(text);

		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}