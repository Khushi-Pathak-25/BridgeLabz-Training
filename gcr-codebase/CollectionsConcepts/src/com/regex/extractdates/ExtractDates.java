/**
        * Word boundary (start)      - \b
        * Two digit day              - \d{2}
        * Date separator             - /
        * Two digit month            - \d{2}
        * Date separator             - /
        * Four digit year            - \d{4}
        * Word boundary (end)        - \b
        */
package com.regex.extractdates;

import java.util.regex.*;

public class ExtractDates {
	public static void main(String[] args) {
		String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

		Matcher matcher = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);

		while (matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
	}
}