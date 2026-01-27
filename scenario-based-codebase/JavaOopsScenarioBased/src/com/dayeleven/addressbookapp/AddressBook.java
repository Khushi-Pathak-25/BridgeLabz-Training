package com.dayeleven.addressbookapp;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<Contact> contacts;

	// constructor
	public AddressBook() {
		contacts = new ArrayList<>();
	}

	// Add new contact - prevents duplicates by name
	public boolean addContact(Contact newContact) {
		for (Contact c : contacts) {
			if (c.isSamePerson(newContact)) {
				return false; // duplicate found
			}
		}
		contacts.add(newContact);
		return true;
	}

	// find contact by full name (case insensitive)
	private Contact findContact(String firstName, String lastName) {
		String searchName = (firstName + " " + lastName).toLowerCase();

		for (Contact c : contacts) {
			if (c.getFullName().equals(searchName)) {
				return c;
			}
		}
		return null;
	}

	// Edit contact
	public boolean editContact(String firstName, String lastName, Contact updatedContact) {
		Contact existing = findContact(firstName, lastName);
		if (existing == null) {
			return false;
		}

		// update fields (keep old name unless changed)
		if (updatedContact.getFirstName() != null && !updatedContact.getFirstName().isEmpty()) {
			existing.setFirstName(updatedContact.getFirstName());
		}
		if (updatedContact.getLastName() != null && !updatedContact.getLastName().isEmpty()) {
			existing.setLastName(updatedContact.getLastName());
		}
		if (updatedContact.getPhoneNumber() != null) {
			existing.setPhoneNumber(updatedContact.getPhoneNumber());
		}
		if (updatedContact.getEmail() != null) {
			existing.setEmail(updatedContact.getEmail());
		}
		if (updatedContact.getAddress() != null) {
			existing.setAddress(updatedContact.getAddress());
		}

		return true;
	}

	// Delete contact
	public boolean deleteContact(String firstName, String lastName) {
		Contact toRemove = findContact(firstName, lastName);
		if (toRemove == null) {
			return false;
		}
		return contacts.remove(toRemove);
	}

	// Search by city or state
	public List<Contact> searchByLocation(String cityOrState) {
		List<Contact> result = new ArrayList<>();

		String search = cityOrState.toLowerCase().trim();

		// loop through all contacts
		for (Contact c : contacts) {
			Address addr = c.getAddress();

			// skip if no address
			if (addr == null) {
				continue;
			}

			// check city
			String city = addr.getCity();
			boolean cityMatch = (city != null) && city.toLowerCase().contains(search);

			// check state
			String state = addr.getState();
			boolean stateMatch = (state != null) && state.toLowerCase().contains(search);

			// if either city or state matches
			if (cityMatch || stateMatch) {
				result.add(c);
			}
		}

		return result;
	}

	// get all contacts sorted alphabetically by full name
	public List<Contact> getSortedContacts() {
		// create a copy -> no change in original list
		List<Contact> sortedList = new ArrayList<>(contacts);

		// Bubble Sort by full name (case insensitive)
		int n = sortedList.size();
		boolean swapped = false;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				Contact a = sortedList.get(j);
				Contact b = sortedList.get(j + 1);

				// compare full names (ignore case)
				if (a.getFullName().compareTo(b.getFullName()) > 0) {
					// swap
					swapped = true;
					Contact temp = sortedList.get(j);
					sortedList.set(j, sortedList.get(j + 1));
					sortedList.set(j + 1, temp);
				}
			}
			if(!swapped) {
				break;
			}
		}

		return sortedList;
	}

	// get total count
	public int getContactCount() {
		return contacts.size();
	}
}