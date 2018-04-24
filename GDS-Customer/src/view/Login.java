package view;

import java.sql.Connection;

import controller.CustomerController;
import database.ConnectionFactory;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//this class also needs to see if the password is correct
public class Login extends Application {
	
	private Connection conn;
	
	@Override
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
		int userNameLimit = 10;
		userName.lengthProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number>observable, Number oldValue, Number newValue ) {
				if (newValue.intValue() > oldValue.intValue()) {
                    if (userName.getText().length() >= userNameLimit) {
                        userName.setText(userName.getText().substring(0, userNameLimit));
                    }
                }
            }
				
			});
		userName.setPrefColumnCount(10);
	    userName.getText();
		GridPane.setConstraints(userName, 0, 20);
		grid.getChildren().add(userName);
		
		//this is a specific class in java that allows for password protection
		final PasswordField pb = new PasswordField();
		int passwordLimit = 8;
		pb.lengthProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number>observable, Number oldValue, Number newValue ) {
				if (newValue.intValue() > oldValue.intValue()) {
                    if (pb.getText().length() >= passwordLimit) {
                        pb.setText(pb.getText().substring(0, passwordLimit));
                    }
                }
            }
				
			});
		pb.setPromptText("Password");
		pb.setPrefColumnCount(8);
	    pb.getText();
		GridPane.setConstraints(pb, 0, 25);
		grid.getChildren().add(pb);

		Button login = new Button("Login");
		GridPane.setConstraints(login, 0, 30);
		grid.getChildren().add(login);
		login.setOnAction(e-> {
			
			if(userName.getText() == null || userName.getText().trim().isEmpty())
			{
				System.out.println("Username field is empty");
			}
			else if(pb.getText() == null || pb.getText().trim().isEmpty())
			{
				System.out.println("Password field is empty");
			}
			else {
				Browse browse = new Browse();
				try {
					browse.start(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("WRONG PASSWORD");
				}	
			}
		});
		Button forgotUsername = new Button("Forgot Username");
		GridPane.setConstraints(forgotUsername, 1, 30);
		grid.getChildren().add(forgotUsername);
		forgotUsername.setOnAction(e-> {
			ForgotUser forgotU= new ForgotUser();
			try {
				forgotU.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		});
		Button forgotPassword = new Button("Forgot Password");
		GridPane.setConstraints(forgotPassword, 1, 40);
		grid.getChildren().add(forgotPassword);
		forgotPassword.setOnAction(e-> {
			ForgotPass forgotP = new ForgotPass();
			try {
				forgotP.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		});
	}
	public Connection getConnection() {
		return conn;
	}

	public void setConnection(Connection conn) {
		this.conn = conn;
	}
}
