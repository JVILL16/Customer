package view;

import controller.CustomerController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Jheremi Villarreal --- add names ---
 * Also added a Produce menu item however it does nothing so far
 *
 */
public class Launcher extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuView.fxml"));
		CustomerController controller = new CustomerController();
		loader.setController(controller);
		Parent rootPane = loader.load();
		Scene menuView = new Scene(rootPane, 600, 400);
		primaryStage.setScene(menuView);
		primaryStage.setTitle("Grocery Delivery System");
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);

	}
	/* (non-Javadoc)
	 * @see javafx.application.Application#init()
	 * 
	 * Later when we start adding list of customers or produce on the menu
	 * or link it to a database to get connection
	 */
	@Override
	public void init() throws Exception {
		super.init();
	}
	@Override
	public void stop() throws Exception {
		super.stop();
	}

}
