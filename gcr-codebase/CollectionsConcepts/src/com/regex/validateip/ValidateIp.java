/**
        * Regex to validate an IPv4 address (0.0.0.0 to 255.255.255.255)
        *
        * Start of string                                   - ^

        * First three octets followed by dot                - ((25[0-5]|2[0-4]\d|[01]?\d\d?)\.){3}
        *   Numbers 250–255                                 - 25[0-5]
        *   Numbers 200–249                                 - 2[0-4]\d
        *   Numbers 0–199                                   - [01]?\d\d?
        *   Dot separator                                   - \.
        *   Repeated exactly three times                    - {3}
        *
        * Last octet (no trailing dot)                      - (25[0-5]|2[0-4]\d|[01]?\d\d?)
        *   Numbers 250–255                                 - 25[0-5]
        *   Numbers 200–249                                 - 2[0-4]\d
        *   Numbers 0–199                                   - [01]?\d\d?
        *
        * End of string                                     - $
        */
package com.regex.validateip;

public class ValidateIp {
	public static void main(String[] args) {
		String ip = "192.168.1.1";
		String regex = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}" + "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";

		System.out.println(ip.matches(regex) ? "Valid IP" : "Invalid IP");
	}
}