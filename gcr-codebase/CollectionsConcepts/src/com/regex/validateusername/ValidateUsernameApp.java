/**
* Start of String 		- ^
* First letter alphabet 	- [A-Za-z]
* Remaining letters 		- [A-Za-z0-9_]{4,14}
* End of String		- $
*/

package com.regex.validateusername;

public class ValidateUsernameApp {
	public static void main(String[] args) {
		String username = "user_123";

		String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

		if (username.matches(regex)) {
			System.out.println("Valid Username");
		} else {
			System.out.println("Invalid Username");
		}
	}
}