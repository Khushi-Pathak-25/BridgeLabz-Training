/*12. "PetPal – Virtual Pet Care App"
Story: You’re creating PetPal, an app that allows users to adopt and care for virtual pets like
dogs, cats, and birds.
Requirements:
● Pet base class: name, type, age.
● Derived classes: Dog, Cat, Bird (use inheritance).
● IInteractable interface with methods like feed(), play(), sleep().
● Encapsulation of hunger and mood levels.
● Use constructors to assign random default values or user-specified pets.
● Operators to increase/decrease energy, hunger based on interactions.
● Polymorphism: makeSound() behaves differently for each pet.
● Access modifiers ensure internal mood status is only modifiable through methods.*/

package com.dayfour.virtualpetcareapp;

import java.util.Scanner;

public class PetPalVirtualPetCareApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("===== Welcome to PetPal – Virtual Pet Care App =====");

		// PET SELECTION 
		System.out.println("Choose Pet Type:");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Bird");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		input.nextLine(); // buffer clear

		System.out.print("Enter Pet Name: ");
		String name = input.nextLine();

		System.out.print("Enter Pet Age: ");
		int age = input.nextInt();

		Pet pet = null ;

		switch (choice) {
		case 1:
			pet = new Dog(name, age);
			break;
		case 2:
			pet = new Cat(name, age);
			break;
		case 3:
			pet = new Bird(name, age);
			break;
		default:
			System.out.println("Invalid choice!");
			System.exit(0);
		}

		// INTERACTION MENU 
		int option;
		do {
			System.out.println("\n--- Pet Interaction Menu ---");
			System.out.println("1. Feed Pet");
			System.out.println("2. Play with Pet");
			System.out.println("3. Put Pet to Sleep");
			System.out.println("4. Make Sound");
			System.out.println("5. Show Pet Status");
			System.out.println("0. Exit");

			System.out.print("Choose option: ");
			option = input.nextInt();

			switch (option) {
			case 1:
				pet.feed();
				break;
			case 2:
				pet.play();
				break;
			case 3:
				pet.sleep();
				break;
			case 4:
				pet.makeSound(); // polymorphism
				break;
			case 5:
				pet.showStatus();
				break;
			case 0:
				System.out.println("Thank you for using PetPal");
				break;
			default:
				System.out.println("Invalid option!");
			}

		} while (option != 0);

		input.close();
	}
}
