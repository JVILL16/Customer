package model;

import java.util.ArrayList;

/**
 * @author OscarSanJuan
 * 
 * Customer class will contain the Array List of Carts and the Account Number of the Customer
 * We are able to Login, Logout, and Change Information of Customer
 */
public class Customer {
	
	private ArrayList<Cart> carts = new ArrayList<Cart>();

	private int accountNr;
	
	public Customer(int accountNr) {
		this.accountNr = accountNr;
	}
	
	/**
	 * Will true if username and password match in database
	 * if not it will return false
	 * 
	 * @return 
	 */
	public boolean login() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean logout() {
		
	}
	
	
	public void ChangeInfo() {
		
	}
	
	
	/**
	 * @return the carts
	 */
	public ArrayList<Cart> getCarts() {
		return carts;
	}

	/**
	 * @return the accountNr
	 */
	public int getAccountNr() {
		return accountNr;
	}
}
