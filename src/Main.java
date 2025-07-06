import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	static GroceryList gl = new GroceryList();
	public static void main(String[] args) {
		
		printInstructions();
		boolean quit =false;
		
		while(!quit) {
			System.out.println("Enter your choice ");
		int value = scanner.nextInt();
		scanner.nextLine();
		
		switch(value) {
		
		case 0:
			printInstructions();
			break;
		case 1:
			gl.printGroceryList();
			break;
		case 2:
			addItems();
			break;
		case 3:
			modifyItems();
			break;
		case 4:
			removeItem();
			break;
		case 5:
			searchItem();
			break;
		case 6:
			quit = true;
			break;
		}
	}
	}
	
	public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
	
	
	public static void addItems() {
		System.out.println("Enter the item :");
		String item = scanner.nextLine();
		gl.addItems(item);
		
	}
	
	
	public static void modifyItems() {
		System.out.print("Enter the Old Item to be modified : ");
		String oldItem = scanner.nextLine();
		System.out.print("Enter the New Item to be added : ");
		String newItem = scanner.nextLine();
		gl.modifyItem(oldItem, newItem);
	}
	
	public static void removeItem() {
		System.out.print("Enter the Old Item to be removed : ");
		String itemToBeRemoved = scanner.nextLine();
		gl.removeItem(itemToBeRemoved);
		
	}
	
	public static void searchItem() {
		System.out.print("Enter the Old Item to be Searched: ");
		String itemToBeSearched = scanner.nextLine();
		gl.searchItem(itemToBeSearched);
	}
	
	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(gl.getGrocerryList());
		
		ArrayList<String> anotherArray = new ArrayList<String>(gl.groceryList);
		
	}
	
	
	
	


}
