package TimSolutonUsingObjects;

import java.util.ArrayList;

public class MobilePhone {

	ArrayList<Contact> myContacts;

	public MobilePhone() {

		this.myContacts = new ArrayList<Contact>();
	}

	public void addContact(Contact contact) {
		myContacts.add(contact);
		System.out.println("Contact has been added");

	}

	public void modifyContact(Contact oldContact, Contact newContact) {
		int position = findContact(oldContact);

		String newName = newContact.getName();

		if ((searchContact(newName) == null)) {

			if (position < 0) {
			}
			
			myContacts.set(position, newContact);
			System.out.println("Sucessfully updated the record with name : " + newName);
		} else {
			System.out.println(newName + " name record already exist in phone directory");

		}

	}

	public boolean removeContact(Contact contact) {
		int position = findContact(contact);
		if (position < 0) {
			return false;
		}
		myContacts.remove(position);
		return true;
	}

	private int findContact(Contact contact) {
		return myContacts.indexOf(contact);
	}

	public boolean searchContact(Contact contact) {
		int position = findContact(contact);
		if (position < 0) {
			return false;
		}

		return true;
	}

	public Contact searchContact(String contactName) {

		for (int i = 0; i < myContacts.size(); i++) {
			if (this.myContacts.get(i).getName().equals(contactName)) {
				return myContacts.get(i);
			}
		}
		return null;

	}

	public void printContact() {
		if (myContacts.size() == 0) {
			System.out.println("No contacts available.");
		}

		for (int i = 0; i < myContacts.size(); i++) {
			System.out.print(myContacts.get(i).getName() + "----->" + myContacts.get(i).getPhoneNumber() + "\n");
		}
	}
}
