import java.util.ArrayList;

public class MobilePhone {

	private String name;
	private String mobileNumber;
	
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String> phoneNumber = new ArrayList<String>();
	
	public void addNewContact(String name, String contactNumber) {
		int position = findName(name);
		if(position < 0) {
		names.add(name);
		phoneNumber.add(contactNumber);
	}
		else {
			System.out.println("Contact name exits.");
		}
	}
	public void updateContact(String oldName,String newName, String newContactNumber) {
		int namePosition  = findName(oldName);
		
		if((namePosition>=0)){
			String oldContactNumber = phoneNumber.get(namePosition);
			updateContact(namePosition,newName, newContactNumber);
			System.out.println("The contact name " + oldName + " and number " + oldContactNumber 
								+ " is updated with new name " + newName + " and number " + newContactNumber);
		}else if(namePosition<=0) {
			System.out.println("Name does not exist.");
		}
	}
	
	
	public void removeContact(String oldName) {
		
		int namePosition  = findName(oldName);
		
		if(namePosition>=0){
			String oldContactNumber = phoneNumber.get(namePosition);
			names.remove(namePosition);
			phoneNumber.remove(namePosition);
			System.out.println("The contact name " + oldName + " hase been removed and respective phone number " + oldContactNumber 
								+ " is removed ");
		}else if(namePosition<=0) {
			System.out.println("Name does not exist.");
		}
	}
	
public void searchContact(String oldName) {
		
	int namePosition  = findName(oldName);
	
	if(namePosition>=0){
		String oldContactNumber = phoneNumber.get(namePosition);
		System.out.println("Contact name " + oldName + " found with phoneNumber " + oldContactNumber);
	}else if(namePosition<=0) {
		System.out.println("Name does not exist.");
	}
}
	

public void printContactList() {
	if(names.size() == 0) {
		System.out.println("No contacts available.");
	}
	for(int i=0; i< names.size(); i++) {
		System.out.print("Name : " + names.get(i) + "\t Phone Number : " + phoneNumber.get(i) + "\n");
	}
}


	private void  updateContact(int position,String newName, String newContactNumber) {
		names.set(position, newName);
		phoneNumber.set(position, newContactNumber);
	}
	
	
	private int findName(String oldName) {
		
		return names.indexOf(oldName);
	}
	
	
	
	
	
}
