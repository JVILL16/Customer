package view;

import controller.CustomerController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login extends Application {
	public void start(Stage primaryStage) throws Exception {
		
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
	
	Label title = new Label("Grocery Delivery System");
	title.setFont(new Font("Arial" , 30));
	GridPane.setConstraints(title, 0, 0);
	grid.getChildren().add(title);
	loginView.setRoot(grid);
	
	
	final TextField userName = new TextField();
	userName.setPromptText("Username");
	userName.setPrefColumnCount(10);
    userName.getText();
	GridPane.setConstraints(userName, 0, 20);
	grid.getChildren().add(userName);
	
	//this is a specific class in java that allows for password protection
	final PasswordField pb = new PasswordField();
	pb.setPromptText("Password");
	pb.setPrefColumnCount(8);
    pb.getText();
	GridPane.setConstraints(pb, 0, 25);
	grid.getChildren().add(pb);
}
}
