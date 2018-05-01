package model;

import database.AppException;
import database.CustomerGateway;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author jvill
 * 
 * Getters and setters of what we want on the menu 
 * Also figure out if we want this to be a member only customer or guest 
 * one or both as to where you get one the application and have a register section for this 
 *
 */
public class Customer {
	
	private int accountNr, storeCredit;
	private SimpleStringProperty username, password, name, deliveryAddr, email, phoneNr;
	
	private CustomerGateway gateway;

	public Customer() {
		username = new SimpleStringProperty();
		password = new SimpleStringProperty();
		deliveryAddr = new SimpleStringProperty();
		email = new SimpleStringProperty();
		name = new SimpleStringProperty();
		phoneNr = new SimpleStringProperty();
		accountNr = 0;
		storeCredit = 0;
	}
	public Customer(String username, String password, String name, String deliveryAddr, String phoneNr, String email) {
		this();
		setUsername(username);
		setPassword(password);
		//setStoreCredit(storeCredit);
		setName(name);
		setDeliveryAddr(deliveryAddr);
		setPhoneNr(phoneNr);
		setEmail(email);
	}
	
	public void save() throws AppException {
		if(this.getAccountNm() == 0) {
			gateway.insertCustomer(this);
		} else {
			gateway.updateCustomer(this);
		}
	}
	
	public int getAccountNm() {
		return accountNr;
	}
	public void setAccountNm(int accountNr) {
		this.accountNr = accountNr;
	}
	
	
	public int getStoreCredit() {
		return storeCredit;
	}
	public void setStoreCredit(int storeCredit) {
		this.storeCredit = storeCredit;
	}
	
	
	public String getPhoneNr() {
		return phoneNr.get();
	}
	public void setPhoneNr(String phoneNr) {
		this.phoneNr.set(phoneNr);
	}
	
	
	public String getUsername() {
		return username.get();
	}
	public void setUsername(String username) {
		this.username.set(username);
	}
	
	
	public String getPassword() {
		return password.get();
	}
	public void setPassword(String password) {
		this.password.set(password);
	}
	
	
	public String getDeliveryAddr() {
		return deliveryAddr.get();
	}
	public void setDeliveryAddr(String deliveryAddr) {
		this.deliveryAddr.set(deliveryAddr);
	}
	
	
	public String getEmail() {
		return email.get();
	}
	public void setEmail(String email) {
		this.email.set(email);
	}
	
	
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
	
	/**
	 * Getter and setter for gateway connection
	 */
	public CustomerGateway getGateway() {
		return gateway;
	}

	public void setGateway(CustomerGateway gateway) {
		this.gateway = gateway;
	}
	
	/**
	 * SimpleStringProperty's
	 */
	public SimpleStringProperty usernameProperty() {
		return username;
	}
	public SimpleStringProperty passwordProperty() {
		return password;
	}
	public SimpleStringProperty deliveryAddrProperty() {
		return deliveryAddr;
	}
	public SimpleStringProperty emailProperty() {
		return email;
	}
	public SimpleStringProperty nameProperty() {
		return name;
	}
	public SimpleStringProperty phoneNrProperty() {
		return phoneNr;
	}
}
