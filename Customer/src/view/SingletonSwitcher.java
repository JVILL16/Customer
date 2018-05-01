package view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;

import controller.CustomerController;
import controller.GeneralController;
import database.AppException;
import database.CustomerGateway;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import model.Customer;


public class SingletonSwitcher {
	public static final int REGISTER_VIEW = 0;

	static  SingletonSwitcher singletonController = null;
	private BorderPane rootPane;
	private Connection conn;
	
	private SingletonSwitcher() {}

	public static SingletonSwitcher getInstance() {
		if(singletonController == null) {
			singletonController = new SingletonSwitcher();
		}
		
		return singletonController;
	}
	
	public void setRootNode(BorderPane rootNode) {
		this.rootPane = rootNode;
	}
	
	
    public void changeView(int viewType, Object arg) throws AppException {
		try {
			GeneralController controller = null;
			URL fxmlFile = null;
			switch(viewType) {
				case REGISTER_VIEW:
					fxmlFile = this.getClass().getResource("RegisterView.fxml");
					controller = new CustomerController((Customer) arg, conn);
					break;
			}
		
			FXMLLoader loader = new FXMLLoader(fxmlFile);
			loader.setController(controller);
		
			Parent viewNode = loader.load();
			rootPane.setCenter(viewNode);
		} catch (IOException e) {
			throw new AppException(e);
		}
	}

    public Connection getConnection() {
		return conn;
	}

	public void setConnection(Connection conn) {
		this.conn = conn;
	}


}

