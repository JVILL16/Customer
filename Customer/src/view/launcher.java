package view;

import java.net.URL;
import java.sql.Connection;

import view.SingletonSwitcher;
import controller.CustomerController;
import controller.CustomerController;
import database.AppException;
import database.ConnectionFactory;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Customer;

public class launcher extends Application{
	private ObservableList<Customer> customers;
	
	private Connection conn;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/*FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuView.fxml"));
		MainMenuController controller = new MainMenuController();
		loader.setController(controller);
		BorderPane rootPane = loader.load();
		Scene scene = new Scene(rootPane, 600, 500);
		primaryStage.setTitle("Grocery Delivery System");
		primaryStage.setScene(scene);
		primaryStage.show();*/

		URL fxmlFile = this.getClass().getResource("MenuView.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile);
		
		BorderPane rootNode = loader.load();
		Scene scene = new Scene(rootNode, 600, 500);
		primaryStage.setTitle("Grocery Delivery System");
		primaryStage.setScene(scene);
		primaryStage.show();
		

		
		
		
		SingletonSwitcher viewSwitch = SingletonSwitcher.getInstance();
		viewSwitch.setConnection(conn);
		viewSwitch.setRootNode((BorderPane) rootNode);
		//viewSwitch.setCustomers(customers);

	}
	@Override
	public void init() throws Exception {
		super.init();
		
		try {
			conn = ConnectionFactory.createConnection();
			System.out.println("connected");
		} catch(AppException e) {
			Platform.exit();
		}
	}


	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		
		conn.close();
	}
	public static void main(String[] args) {
		launch(args);

	}
}