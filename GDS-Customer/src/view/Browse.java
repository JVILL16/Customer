package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Browse extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Pane rootPane = new Pane();
		Scene browseView = new Scene(rootPane, 1000, 900);
		primaryStage.setScene(browseView);
		primaryStage.setTitle("Grocery Delivery System");
		primaryStage.show();

		
		Label title = new Label("Grocery Delivery System");
		title.setFont(new Font("Arial" , 30));
		rootPane.getChildren().add(title);
		browseView.setRoot(rootPane);
		
		ScrollBar scrollBar = new ScrollBar();
		scrollBar.setOrientation(Orientation.VERTICAL);
		scrollBar.relocate(980,0);
		scrollBar.setPrefHeight(1000);
		rootPane.getChildren().add(scrollBar);
		
		ImageView apple = new ImageView(new Image("media/1111.jpg"));
		apple.relocate(0,50);
		rootPane.getChildren().add(apple);
		
		Button item1 = new Button("AddItem");
		
		item1.relocate(0,300);
		rootPane.getChildren().add(item1);
		item1.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		AddItem newItem = new AddItem();
		try {
			newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		Button item2 = new Button("AddItem");
		item2.relocate(0,400);
		rootPane.getChildren().add(item2);
		item2.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		AddItem newItem = new AddItem();
		try {
			newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		Button logout = new Button("Logout");
		logout.relocate(810,0);
		rootPane.getChildren().add(logout);
		item1.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		try {
			//newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
	}
}