/*
	This code is for the GUI prototype
	It gives a stakeholder an idea of what it should look like
	And it gives the APO/Grunts an easier understanding on how the view should be
	This does not use MVC but the APO code does and that is the other portion with
	DataBase connections
*/
package view;

import java.util.HashMap;

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
public static int cartNumber;
public static double onionAmount;
	
	public void start(Stage primaryStage) throws Exception {
	
		HashMap cartStuff = new HashMap();
		
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
		costApp.setFont(new Font("Arial",15));
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
		try {
		
		} catch (Exception e1) {
			
		}	
});
		Label costOnion = new Label("Cost of Onions per Unit $.60");
		costOnion.setFont(new Font("Arial",15));
		costOnion.relocate(0,532);
		rootPane.getChildren().add(costOnion);
		
		ImageView onion = new ImageView(new Image("media/0000.jpeg"));
		onion.relocate(0,350);
		rootPane.getChildren().add(onion);
		final TextField quantinty0000 = new TextField();
		quantinty0000.setPromptText("Unit");
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
		try {
			double q0000 =  Double.parseDouble(quantinty0000.getText());
			double onionAmount = q0000 * .60;
		} catch (Exception e1) {
			
		}	
});
	
		Label costGarlic = new Label("Cost of Garlic per Unit $.50");
		costGarlic.setFont(new Font("Arial",15));
		costGarlic.relocate(0,830);
		rootPane.getChildren().add(costGarlic);
		
		ImageView garlic = new ImageView(new Image("media/1234.jpeg"));
		garlic.relocate(0,600);
		rootPane.getChildren().add(garlic);
		final TextField quantinty1234 = new TextField();
		quantinty1234.setPromptText("Unit");
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
			double q1234 =  Double.parseDouble(quantinty1234.getText());
			double garlicAmount = q1234 * .50;
			System.out.println(garlicAmount);
			newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		Label costBana = new Label("Cost of Banana per LB $2.00");
		costBana.setFont(new Font("Arial",15));
		costBana.relocate(600,250);
		rootPane.getChildren().add(costBana);
		
		
		ImageView bana = new ImageView(new Image("media/2222.jpeg"));
		bana.relocate(600,50);
		rootPane.getChildren().add(bana);
		final TextField quantinty2222 = new TextField();
		quantinty2222.setPromptText("Weight");
		quantinty2222.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            quantinty2222.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		quantinty2222.relocate(700, 300);
		rootPane.getChildren().add(quantinty2222);
		
		Button item4 = new Button("AddItem");
		item4.relocate(600,300);
		rootPane.getChildren().add(item4);
		item4.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		AddItem newItem = new AddItem();
		try {
			double q2222 =  Double.parseDouble(quantinty2222.getText());
			double banaAmount = q2222 * 2.00;
			System.out.println(banaAmount);
			newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		Label costGinger = new Label("Cost of Ginger per LB $3.00");
		costGinger.setFont(new Font("Arial",15));
		costGinger.relocate(600,575);
		rootPane.getChildren().add(costGinger);
		
		ImageView ginger = new ImageView(new Image("media/2345.jpeg"));
		ginger.relocate(600,350);
		rootPane.getChildren().add(ginger);
		final TextField quantinty2345 = new TextField();
		quantinty2345.setPromptText("Weight");
		quantinty2345.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            quantinty2345.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		quantinty2345.relocate(700, 600);
		rootPane.getChildren().add(quantinty2345);
		
		Button item5 = new Button("AddItem");
		item5.relocate(600,600);
		rootPane.getChildren().add(item5);
		item5.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		AddItem newItem = new AddItem();
		try {
			double q2345 =  Double.parseDouble(quantinty2345.getText());
			double gingerAmount = q2345 * 3.00;
			System.out.println(gingerAmount);
			newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		
		Label costOrange = new Label("Cost of Orange per LB $3.00");
		costOrange.setFont(new Font("Arial",15));
		costOrange.relocate(600,880);
		rootPane.getChildren().add(costOrange);
		
		ImageView oranges = new ImageView(new Image("media/3333.jpeg"));
		oranges.relocate(600,650);
		rootPane.getChildren().add(oranges);
		final TextField quantinty3333 = new TextField();
		quantinty3333.setPromptText("Weight");
		quantinty3333.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            quantinty3333.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		quantinty3333.relocate(700, 850);
		rootPane.getChildren().add(quantinty3333);
		
		Button item6 = new Button("AddItem");
		item6.relocate(600,850);
		rootPane.getChildren().add(item6);
		item6.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		AddItem newItem = new AddItem();
		try {
			double q3333 =  Double.parseDouble(quantinty3333.getText());
			double orangesAmount = q3333 * 3.00;
			System.out.println(orangesAmount);
			newItem.start(primaryStage);
		} catch (Exception e1) {
			
		}	
});
		
		Button Cart = new Button("cart");
		Cart.relocate(750,0);
		rootPane.getChildren().add(Cart);
		Cart.setOnAction(e-> {
		//want to ask if you want to add the item to your cart
		try {
			ShoppingCart shopping = new ShoppingCart();
			shopping.start(primaryStage);
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