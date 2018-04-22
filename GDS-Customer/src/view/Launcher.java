package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import controller.CustomerController;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import view.Login;

/**
 * @author Jheremi Villarreal --- add names ---
 * Also added a Produce menu item however it does nothing so far
 *
 */
public class Launcher extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuView.fxml"));
		CustomerController controller = new CustomerController();
		//loader.setController(controller);
		//Parent rootPane = loader.load();
		Group rootPane = new Group();
		Scene menuView = new Scene(rootPane, 600, 500);
		primaryStage.setScene(menuView);
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
		menuView.setRoot(grid);

		final TextField name = new TextField();
		int nameLimit = 20;
		name.lengthProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number>observable, Number oldValue, Number newValue ) {
				if (newValue.intValue() > oldValue.intValue()) {
                    if (name.getText().length() >= nameLimit) {
                        name.setText(name.getText().substring(0, nameLimit));
                    }
                }
            }
				
			});
		name.setPromptText("First Name");
		name.setPrefColumnCount(20);
	    name.getText();
		GridPane.setConstraints(name, 0, 5);
		grid.getChildren().add(name);
		
		final TextField lastName = new TextField();
		int lastNameLimit = 20;
		lastName.lengthProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number>observable, Number oldValue, Number newValue ) {
				if (newValue.intValue() > oldValue.intValue()) {
                    if (lastName.getText().length() >= lastNameLimit) {
                        lastName.setText(lastName.getText().substring(0, lastNameLimit));
                    }
                }
            }
				
			});
		lastName.setPromptText("Last Name");
		lastName.setPrefColumnCount(20);
	    lastName.getText();
		GridPane.setConstraints(lastName, 0, 10);
		grid.getChildren().add(lastName);
		
		final TextField email = new TextField();
		int emailLimit = 30;
		email.lengthProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number>observable, Number oldValue, Number newValue ) {
				if (newValue.intValue() > oldValue.intValue()) {
                    if (email.getText().length() >= emailLimit) {
                        email.setText(email.getText().substring(0, emailLimit));
                    }
                }
            }
				
			});
		email.setPromptText("Email Address");
		email.setPrefColumnCount(30);
	    email.getText();
		GridPane.setConstraints(email, 0, 15);
		grid.getChildren().add(email);
		
		final TextField userName = new TextField();
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
		userName.setPromptText("Username");
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
		
		
		
		Button createAccount = new Button("Create Account");
		GridPane.setConstraints(createAccount, 0, 30);
		grid.getChildren().add(createAccount);
			createAccount.setOnAction(e-> {
				Browse browse = new Browse();
				try {
					browse.start(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			});
		//p=8
		//u=10
		//name=20
		//email=30

		Button login = new Button("Have Login?");
		GridPane.setConstraints(login, 0, 35);
		grid.getChildren().add(login);
		login.setOnAction(e-> {
			Login login1 = new Login();
			try {
				login1.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		});

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
