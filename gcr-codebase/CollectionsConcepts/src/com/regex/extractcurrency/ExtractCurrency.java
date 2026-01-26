/**
 * Optional currency symbol        - \$
 * Zero or one occurrence          - ?
 * One or more digits (amount)     - \d+
 * Decimal point                   - \.
 * Exactly two decimal digits      - \d{2}
 */
package com.regex.extractcurrency;

import java.util.regex.*;

public class ExtractCurrency {
	public static void main(String[] args) {
		String text = "The price is $45.99, and the discount is 10.50.";

		Matcher matcher = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}