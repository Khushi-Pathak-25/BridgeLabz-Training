package com.interfaces.functional.stringlength;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthCheckerApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("String Length Checker (using Function<String, Integer>)");
	System.out.print("Enter your message: ");
	String userMessage = input.nextLine();

	MessageValidator validator = new MessageValidator(userMessage);

	System.out.println("\nChoose validation rule:");
	System.out.println("1 - Standard SMS limit (160 characters)");
	System.out.println("2 - Tweet limit (280 characters)");
	System.out.println("3 - Custom limit");
	System.out.print("Select option (1-3): ");

	int choice = input.nextInt();
	int maxLimit;

	switch (choice) {
	case 1:
	    maxLimit = 160;
	    break;
	case 2:
	    maxLimit = 280;
	    break;
	case 3:
	    System.out.print("Enter custom max character limit: ");
	    maxLimit = input.nextInt();
	    break;
	default:
	    System.out.println("Invalid choice. Using default SMS limit (160).");
	    maxLimit = 160;
	    break;
	}

	// Define length function using lambda -> matches Function<String, Integer>
	Function<String, Integer> lengthFunction = String::length;

	System.out.println("\nValidating message...");
	validator.validateLength(lengthFunction, maxLimit);

	// alternative length function (e.g. visible characters only)
	System.out.print("\nAlso check visible characters only? (yes/no): ");
	// consume newline
	input.nextLine();
	String response = input.nextLine().trim().toLowerCase();

	if (response.equals("yes")) {
	    Function<String, Integer> visibleLength = s -> s.replaceAll("\\s+", "").length();
	    System.out.println("Visible characters only validation:");
	    validator.validateLength(visibleLength, maxLimit);
	}

	System.out.println("\n" + validator);

	input.close();
    }
}