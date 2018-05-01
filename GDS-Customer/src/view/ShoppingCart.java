package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ShoppingCart {
	
	
	public void start(Stage primaryStage) {
		Pane rootPane = new Pane();
		Scene browseView = new Scene(rootPane, 600, 600);
		primaryStage.setScene(browseView);
		primaryStage.setTitle("Grocery Delivery System");
		primaryStage.show();

		
		
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
		Button checkOut = new Button("CheckOut?");
		checkOut.relocate(250,300);
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
