/**
 * Start of String 		- ^
 * First two uppercase letters	- [A-Z]{2}
 * Following four digits 	- [0-9]{4}
 * End of String 		- $
 */

package com.regex.validatelicenseplate;

public class ValidateLicensePlate {

	public static void main(String[] args) {
		String plate = "AB1234";

		String regex = "^[A-Z]{2}[0-9]{4}$";

		System.out.println(plate.matches(regex) ? "Valid" : "Invalid");
	}
}