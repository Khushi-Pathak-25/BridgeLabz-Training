
package com.searching.strings;

public class StringBuilderReverseString {

	// Reverses a string using StringBuilder
	public static String reverseString(String input) {

		StringBuilder sb = new StringBuilder();

		// Append string to StringBuilder
		sb.append(input);

		// Reverse the xstring
		sb.reverse();

		// Convert back to String
		return sb.toString();
	}

	public static void main(String[] args) {

		String input = "Hello World";

		System.out.println("Original String: " + input);

		String reversed = reverseString(input);

		System.out.println("Reversed String: " + reversed);
	}
}