package view;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
		
		Label costApp = new Label("Cost of Apples per LB $1.00");
		costApp.setFont(new Font("Arial",20));
		costApp.relocate(0,270);
		rootPane.getChildren().add(costApp);
		
		ImageView apple = new ImageView(new Image("media/1111.jpeg"));
		apple.relocate(0,50);
		rootPane.getChildren().add(apple);
		final TextField quantinty1111 = new TextField();
		quantinty1111.setPromptText("Weight");
		quantinty1111.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            quantinty1111.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		quantinty1111.relocate(100, 300);
		rootPane.getChildren().add(quantinty1111);
		
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
	
		ImageView onion = new ImageView(new Image("media/0000.jpeg"));
		onion.relocate(0,350);
		rootPane.getChildren().add(onion);
		final TextField quantinty0000 = new TextField();
		quantinty0000.setPromptText("Weight");
		quantinty0000.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            quantinty0000.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		quantinty0000.relocate(100, 550);
		rootPane.getChildren().add(quantinty0000);
		
		Button item2 = new Button("AddItem");
		item2.relocate(0,550);
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
		
		ImageView garlic = new ImageView(new Image("media/1234.jpeg"));
		garlic.relocate(0,600);
		rootPane.getChildren().add(garlic);
		final TextField quantinty1234 = new TextField();
		quantinty1234.setPromptText("Weight");
		quantinty1234.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            quantinty1234.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		quantinty1234.relocate(100, 850);
		rootPane.getChildren().add(quantinty1234);
		
		
		
		Button item3 = new Button("AddItem");
		item3.relocate(0,850);
		rootPane.getChildren().add(item3);
		item3.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		AddItem newItem = new AddItem();
		try {
			newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		
		
		
		
	}
}