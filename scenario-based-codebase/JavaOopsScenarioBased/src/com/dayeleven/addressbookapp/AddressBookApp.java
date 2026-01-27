/*
Address Book System
 OOP Concepts:
	Classes, Objects, Encapsulation, Constructors, Access Modifiers, Collections
 Scenario:
	You’ve been hired by DigiContact Pvt. Ltd., a startup creating digital tools for managing
	contacts and relationships. They want a simple but robust Address Book application.
 Each Contact should include:
	● First Name, Last Name
	● Phone Number, Email
	● Address (optional: City, State, Zip)
 Problem Statement:
 	Develop a Java application that:
		● Adds a new contact (with validation for duplicates)
		● Edits an existing contact by name
		● Deletes a contact by name
		● Searches contacts by city or state
		● Displays all contacts sorted alphabetically
		● Stores contacts in an in-memory structure like ArrayList<Contact>
 	Use:
		● Classes and constructors to initialize contacts
		● Encapsulation for secure data access
		● Optional use of composition (Address as a separate class)
*/
package com.dayeleven.addressbookapp;
public class AddressBookApp {
	public static void main(String[] args) {
		AddressBook book = new AddressBook();

		// Added example contacts
		book.addContact(new Contact("Rahul", "Sharma", "9876543210", "rahul.sharma@gmail.com",
				new Address("Indore", "Madhya Pradesh", "452001")));

		book.addContact(new Contact("Priya", "Verma", "8765432109", "priya.v@gmail.com",
				new Address("Bhopal", "Madhya Pradesh", "462001")));

		book.addContact(new Contact("Aarav", "Patel", "7654321098", "aarav.p@yahoo.com",
				new Address("Ujjain", "Madhya Pradesh", "456001")));

		book.addContact(new Contact("Ananya", "Gupta", "6543210987", "ananya.g@gmail.com", null)); // no address

		System.out.println("All Contacts (sorted):");
		System.out.println("---------------------------------------------------------------");
		for (Contact c : book.getSortedContacts()) {
			System.out.println(c);
		}
		System.out.println("Total contacts: " + book.getContactCount() + "\n");

		// Try adding duplicate
		boolean added = book.addContact(new Contact("Rahul", "Sharma", "9999999999", "new@gmail.com", null));
		System.out.println("Trying to add duplicate Rahul Sharma -> " + (added ? "Success" : "Failed (duplicate)"));

		// Search by city/state
		System.out.println("\nContacts from Madhya Pradesh:");
		for (Contact c : book.searchByLocation("Madhya Pradesh")) {
			System.out.println(c);
		}

		// Edit example
		Contact updated = new Contact("", "", "8888888888", "priya.new@gmail.com", null);
		boolean edited = book.editContact("Priya", "Verma", updated);
		System.out.println("\nEditing Priya Verma phone & email -> " + (edited ? "Success" : "Failed"));

		// Show updated list
		System.out.println("\nUpdated Contact List:");
		for (Contact c : book.getSortedContacts()) {
			System.out.println(c);
		}

		// Delete
		boolean deleted = book.deleteContact("Aarav", "Patel");
		System.out.println("\nDeleting Aarav Patel -> " + (deleted ? "Success" : "Failed"));
		System.out.println("Remaining contacts: " + book.getContactCount());
	}
}