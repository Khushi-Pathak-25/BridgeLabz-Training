/**
        * Start of string               - ^
        * First three digits            - \d{3}
        * Hyphen separator              - -
        * Next two digits               - \d{2}
        * Hyphen separator              - -
        * Last four digits              - \d{4}
        * End of string                 - $
        */
package com.regex.validatessn;

public class ValidateSsn {
	
	public static void main(String[] args) {
		String ssn = "123-45-6789";

		String regex = "^\\d{3}-\\d{2}-\\d{4}$";

		System.out.println(ssn.matches(regex) ? "Valid SSN" : "Invalid SSN");
	}
}