import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobile = new MobilePhone();
	
	public static void main(String[] args) {

		menu();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter your choice : ");
			int value = scanner.nextInt();
			scanner.nextLine();
			switch (value) {
			case 0:
				flag = false;
				break;
			case 1:
				mobile.printContactList();
				break;
			case 2:
				addContact();
				break;
			case 3:
				modifyContact();
				break;
			case 4:
				searchContact();
				break;
			case 5:
				removeContact();
				break;
			}
		}

	}

	public static void menu() {
		System.out.println("\n Press");
		System.out.println("\t 0 to Quit the application.");
		System.out.println("\t 1 to Print the list of contact numbers.");
		System.out.println("\t 2 to Add the contact number.");
		System.out.println("\t 3 to Modify the contact number.");
		System.out.println("\t 4 to Search the contact number.");
		System.out.println("\t 5 to Remove the contact number.");
	}
	
	public static void addContact() {
		System.out.println("Enter the name :");
		String name = scanner.nextLine();
		
		System.out.println("Enter the phone number :");
		String contactNumber = scanner.nextLine();
		mobile.addNewContact(name, contactNumber);
	}
	
	
	public static void modifyContact() {
		System.out.println("Enter the old name to be modified : ");
		String oldName = scanner.nextLine();
		System.out.println("Enter the new name :");
		String newName = scanner.nextLine();
		System.out.println("Enter the new phone number :");
		String newContactNumber = scanner.nextLine();
		mobile.updateContact(oldName,newName, newContactNumber);
	}
	
	public static void removeContact() {
		System.out.println("Enter the old name to be removed : ");
		String oldName = scanner.nextLine();
		mobile.removeContact(oldName);
	}
	
	public static void searchContact() {
		System.out.println("Enter the name to be searched : ");
		String oldName = scanner.nextLine();
		mobile.searchContact(oldName);
	}
	
}
