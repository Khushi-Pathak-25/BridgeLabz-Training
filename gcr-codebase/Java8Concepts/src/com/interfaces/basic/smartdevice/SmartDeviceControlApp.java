package com.interfaces.basic.smartdevice;

import java.util.Scanner;

public class SmartDeviceControlApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// create devices
		Device livingLight = new Light("Living Room");
		Device bedroomAC = new AC("Bedroom");
		Device hallTV = new TV("Samsung");

		int choice = 0;
		while (choice != 3) {
			System.out.println("\n----------------------------------------------");
			System.out.println("Smart Home Device Control");
			System.out.println("1 - Turn ON all devices");
			System.out.println("2 - Turn OFF all devices");
			System.out.println("3 - Exit");
			System.out.println("----------------------------------------------");
			System.out.print("Choose option (1-3): ");

			choice = input.nextInt();

			if (choice == 1) {
				System.out.println("\nTurning ON devices:");
				livingLight.turnOn();
				bedroomAC.turnOn();
				hallTV.turnOn();
			} else if (choice == 2) {
				System.out.println("\nTurning OFF devices:");
				livingLight.turnOff();
				bedroomAC.turnOff();
				hallTV.turnOff();
			} else {
				System.out.println("\nExiting...");
			}

		}
		input.close();
	}
}