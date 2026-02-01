package com.lambdas.smarthome;

import java.util.Scanner;

public class SmartHomeLightingApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// Create a sample smart light
	SmartLight livingRoomLight = new SmartLight("Living Room Light");

	System.out.println("Smart Home Lighting Automation Demo");
	System.out.print("Enter trigger (motion / voice / evening / off / exit): ");

	while (true) {
	    System.out.print("\nTrigger: ");
	    String trigger = input.nextLine().trim().toLowerCase();

	    if (trigger.equals("exit")) {
		System.out.println("Exiting...");
		break;
	    }

	    // Define different behaviors using lambdas without extra classes
	    LightBehavior behavior;

	    switch (trigger) {
	    case "motion":
		behavior = (_) -> System.out.print("Motion detected → Bright full light! ");
		break;

	    case "voice":
		behavior = (_) -> System.out.print("Voice command → Color changing party mode! ");
		break;

	    case "evening":
		behavior = (_) -> System.out.print("Evening time → Warm dim glow! ");
		break;

	    case "off":
		behavior = (_) -> System.out.print("Turn off command → Lights going dark. ");
		break;

	    default:
		System.out.println("Unknown trigger. Try motion/evening/voice/off/exit");
		continue;
	    }

	    // apply the dynamically chosen lambda behavior
	    livingRoomLight.applyBehavior(behavior, trigger);
	    System.out.println(livingRoomLight);
	}

	input.close();
    }
}