package controller;

import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;

import database.CustomerGateway;
import javafx.scene.control.*;
import model.Customer;
import view.MyController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class CustomerController implements Initializable, MyController, GeneralController {
	 
	@FXML private TextField UserName;
	@FXML private TextField Email;
	@FXML private TextField Address;
	@FXML private Button Register;
	@FXML private TextField Phone;
    @FXML private PasswordField PassWord;
	@FXML private Button ExistLogin;
	@FXML private TextField Name;
   
    private Customer customer;
	private CustomerGateway gateway;
	//private ObservableList<Customer> customers;
	private Connection conn;


    
    public CustomerController(Customer customer, Connection conn) {
    	this();
        this.customer = customer;
        this.conn = conn;
    }
    public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	@FXML
    public void registerUser() {
    	customer.save();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {

        UserName.textProperty().bindBidirectional(customer.usernameProperty());
        Email.textProperty().bindBidirectional(customer.emailProperty());
        Address.textProperty().bindBidirectional(customer.deliveryAddrProperty());
        Phone.textProperty().bindBidirectional(customer.phoneNrProperty());
        PassWord.textProperty().bindBidirectional(customer.passwordProperty());
        Name.textProperty().bindBidirectional(customer.nameProperty());
	}
}

