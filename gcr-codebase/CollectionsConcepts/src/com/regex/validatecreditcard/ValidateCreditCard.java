/** 
 * Start of string                - ^
 * First digit (4 or 5)           - (4|5)
 * Following fifteen digits       - \d{15}
 * End of string                  - $
 */
package com.regex.validatecreditcard;

public class ValidateCreditCard {
	public static void main(String[] args) {
		String card = "4123456789012345";

		String regex = "^(4|5)\\d{15}$";

		System.out.println(card.matches(regex) ? "Valid Card" : "Invalid Card");
	}
}