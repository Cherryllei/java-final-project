package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * One object of class ContactList represents a whole list of Contacts
 * 
 * @author Chunlei Li
 */

public class ContactList {
	// Initialize an empty list to store contacts.
	private List<Contact> contacts = new ArrayList<Contact>();

	/**
	 * Load contact list from disk If there's no contact list file, create a new
	 * one
	 * 
	 * @author CL
	 */
	public void loadContactList() {

	}

	/**
	 * Add a new contact to the contact list
	 * 
	 * @author CL
	 */
	public void addContact(Contact newContact) {
		contacts.add(newContact);
	}

	/**
	 * Returns any contact whose last name matches lastName
	 * 
	 * @author CL
	 */
	public List<Contact> searchContacts(String lastName) {
		return Collections.emptyList();
	}

	/**
	 * Save contact list to disk
	 * 
	 * @author CL
	 */
	public void saveContactList() {
		return;
	}
	
	/**
	 * Returns a string with all the contacts from the contact list
	 * 
	 * @author JD
	 */
	public String toString() {
		return contacts.toString();
	}
}
