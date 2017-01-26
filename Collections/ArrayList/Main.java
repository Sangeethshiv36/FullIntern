package ArrayList;

import java.util.Scanner;

public class Main {

	private static Scanner userInput = new Scanner(System.in);
	private static ShoppingCart cart = new ShoppingCart();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ShoppingCart cart = new ShoppingCart();
		// cart.addCartItem("SeagateBackup Plus");
		// cart.addCartItem("Pen drive");
		// cart.addCartItem("Mouse");
		// System.out.println("--------------------------------------------------");
		// cart.printCartItem();
		// System.out.println("--------------------------------------------------");
		// cart.updateCartItem(2, "Graphics Card");
		// System.out.println("--------------------------------------------------");
		// cart.removeCartItem(1);
		// System.out.println("--------------------------------------------------");
		// System.out.println(cart.findItem("Graphics Card"));

		boolean quit = false;
		int choice = 0;
		printInstructions();

		while (!quit) {
			System.out.println("Enter your choice :");
			choice = userInput.nextInt();
			userInput.nextLine();

			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				cart.printCartItem();
				break;
			case 2:
				addItem();
				break;
			case 3:
				updateItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options. ");
		System.out.println("\t 1 - To print the list of Items in Shopping Cart. ");
		System.out.println("\t 2 - To add an item to the cart. ");
		System.out.println("\t 3 - To update an item in the cart. ");
		System.out.println("\t 4 - To remove an item from the cart. ");
		System.out.println("\t 5 - To search for an item in the cart. ");
		System.out.println("\t 6 - Quit. ");
	}

	public static void addItem() {
		System.out.print("Please enter the item to add in your cart :");
		cart.addCartItem(userInput.nextLine());
	}

	public static void updateItem() {
		System.out.println("Enter item name :");
		String itemName = userInput.nextLine();
		System.out.print("Enter replacement item:");
		String newItem = userInput.nextLine();
		cart.updateCartItem(itemName, newItem);
	}

	public static void removeItem() {
		System.out.print("Enter the item number to be removed :");
		String itemName = userInput.nextLine();
		cart.removeCartItem(itemName);

	}

	public static void searchForItem() {
		System.out.print("Item to Search for :");
		String searchItem = userInput.nextLine();
		if (cart.onCart(searchItem)) {
			System.out.println("Found " + searchItem + " in Shopping Cart.");
		} else {
			System.out.println(searchItem + " is not in the Shopping Cart.");
		}

	}

}
