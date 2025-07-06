import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
	ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addItems(String item) {
		groceryList.add(item);
	}
	
	
	
	public void printGroceryList() {
			System.out.println("Your Current Items Are :");
		for(int i=0; i< groceryList.size(); i++) {
			System.out.println(groceryList.get(i));
			
		}
	}
	
	public void modifyItem(String oldItem, String newItem) {
		int isThereAnItem = searchItem(oldItem);
		if(isThereAnItem >= 0) {
			int position = groceryList.indexOf(oldItem);
			modifyItem(position,newItem);
			System.out.println("Grocery Item " +  oldItem + " has been modified to " + newItem);
		}
		
	}
	
	private void modifyItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println(groceryList.toString());
	}
	
	
	public void removeItem(String removeItemName) {
		int position = searchItem(removeItemName);
		if(position>0) {
		groceryList.remove(position);
		System.out.println(removeItemName + " has been removed.");
		}
	}
	
	
	public int searchItem(String searchItemName) {
		int position = groceryList.indexOf(searchItemName);
		if(position < 0) {
			System.out.println("There is no item added in the name : " + searchItemName);
			return -1;
		}
		
		return position;
	}
	

	public ArrayList getGrocerryList() {
		return groceryList;
		
	}
	
}
