package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import view.SingletonSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.Customer;

public class MainMenuController implements Initializable {
	@FXML private Button login;
    @FXML private Button registerMain;
    
	@FXML private void handleMenuAction(ActionEvent event) throws IOException {

		if(event.getSource() == registerMain) {

	        SingletonSwitcher.getInstance().changeView(0, new Customer());
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resource) {
		// TODO Auto-generated method stub
		
	}
}
