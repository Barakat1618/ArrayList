package TimSolutonUsingObjects;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone();

	public static void main(String[] args) {
		System.out.println("Press 5 to check the options");
		boolean flag = true;
		while (flag) {
			System.out.println("Enter your choice");

			int switchValue = scanner.nextInt();
			scanner.nextLine();

			switch (switchValue) {
			case 0:
				System.out.println("Quitting the application");
				flag = false;
				break;
			case 1:
				addNewContact();
				break;
			case 2:
				modifyContact();
				break;
			case 3:
				removeContact();
				break;
			case 4:
				printContact();
				break;
			case 5:
				printOptions();
				break;

			}

		}
	}

	public static void addNewContact() {

		System.out.println("Enter the contact name");

		String name = scanner.nextLine();

		System.out.println("Enter the phone number");
		String phoneNumber = scanner.nextLine();

		Contact contact = mobilePhone.searchContact(name);

		if (contact == null) {
			contact = Contact.createNewContact(name, phoneNumber);
			mobilePhone.addContact(contact);
		} else {
			System.out.println("Error updating contact name " + name + " already exits.");
		}
	}

	public static void modifyContact() {
		System.out.println("Enter the old contact name to be modified");
		String name = scanner.nextLine();

		Contact oldContact = mobilePhone.searchContact(name);

		if (oldContact == null) {
			System.out.println("Error updating contact." + name + " does not exist");
		} else {
			System.out.println("Enter the new contact name");

			String newName = scanner.nextLine();

			System.out.println("Enter the new phone number");
			String newPhoneNumber = scanner.nextLine();

			Contact newContact = Contact.createNewContact(newName, newPhoneNumber);

			mobilePhone.modifyContact(oldContact, newContact);

		}
	}

	public static void removeContact() {
		System.out.println("Enter the contact name");
		String name = scanner.nextLine();
		Contact contact = mobilePhone.searchContact(name);
		if (mobilePhone.removeContact(contact)) {
			System.out.println("Contact removed Succesfully" + name);
		} else {
			System.out.println("Error removing contact. Contact name " + name + " does not exist.");
		}
	}

	public static void printContact() {
		mobilePhone.printContact();
	}

	public static void printOptions() {
		System.out.println("\n Press: \n" + "\t0 to quit the application\n" + "\t 1 to add the contcat\n"
				+ "\t 2 to modify the existing contact\n" + "\t 3 to remove the contact\n"
				+ "\t 4 to print the list of contact\n" + "\t 5 to check options\n");
	}

}
