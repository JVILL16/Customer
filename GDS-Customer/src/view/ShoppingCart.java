package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShoppingCart {

	public void start(Stage primaryStage) {
		Group rootPane = new Group();
		Scene loginView = new Scene(rootPane, 600, 500);
		primaryStage.setScene(loginView);
		primaryStage.setTitle("Grocery Delivery System");
		primaryStage.show();
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(5);
		grid.setHgap(5);
		
		Button browse = new Button("Back");
		browse.relocate(0,0);
		rootPane.getChildren().add(browse);
		browse.setOnAction(e-> {
			
		//want to ask if you want to add the item to your cart
		try {
			Browse browses = new Browse();
			browses.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		Button checkOut = new Button("CheckOut");
		checkOut.relocate(0,0);
		rootPane.getChildren().add(checkOut);
		checkOut.setOnAction(e-> {
			
		//want to ask if you want to add the item to your cart
		try {
			CheckOut check = new CheckOut();
			check.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
	}
	
}
