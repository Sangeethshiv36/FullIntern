package ArrayList;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<String> shoppingCart = new ArrayList<String>();

	public void addCartItem(String item) {
		shoppingCart.add(item);
		System.out.println(item + " added to your Shopping Cart.");
	}

	public void printCartItem() {
		System.out.println("You have " + shoppingCart.size() + " items in your Shopping Cart.");
		for (int i = 0; i < shoppingCart.size(); i++) {
			System.out.println((i + 1) + "." + shoppingCart.get(i));
		}
	}

	public void updateCartItem(String currentItem, String newItem) {
		int position = findItem(currentItem);
		if (position >= 0) {
			updateCartItem(position, newItem);
		}
	}

	private void updateCartItem(int position, String newItem) {
		shoppingCart.set(position, newItem);
		System.out.println("Cart Item " + (position + 1) + " has been updated with " + newItem + ".");
	}

	public void removeCartItem(String itemName) {
		int position = findItem(itemName);
		if (position >= 0) {
			removeCartItem(position);
		}
	}

	private void removeCartItem(int position) {
		String name=shoppingCart.get(position);
		shoppingCart.remove(position);
		System.out.println("Item :"+name+" removed from Cart.");
	}

	public boolean onCart(String searchItem) {
		int position = findItem(searchItem);
		if (position >= 0) {
			return true;
		}
		return false;
	}

	private int findItem(String searchItem) {
		return shoppingCart.indexOf(searchItem);
	}
}
