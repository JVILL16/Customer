package model;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private boolean cartStatus = false;
	
	public Cart() {	
	}
	
	/**
	 * 
	 * @return totalCost
	 * 
	 * Calculates total cost of item list
	 * Return the total cost plus tax
	 */
	public double totalCost() {
		int totalCost = 0;
		
		for(Item item : itemList){
			int itemCost = item.getPrice() * item.getCount() * item.getWeight();
			totalCost += itemCost;
		}
		
		return totalCost * 1.825;
	}
	
	/**
	 * 
	 * @param item
	 * 
	 * Adds item to item list
	 */
	public void addItem(Item item) {
		cartStatus = true;
		itemList.add(item);
	}
	
	/**
	 * 
	 * @param item
	 * 
	 * Removes item from item list
	 */
	public void removeItem(Item item) {
		itemList.remove(item);
	}
	
	/**
	 *  Sets cart Status to false
	 */
	public void checkout() {
		cartStatus = false;
	}
	

	/**
	 * @return the itemList
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}

	/**
	 * @return the cartStatus
	 */
	public boolean isCartStatus() {
		return cartStatus;
	}

}
