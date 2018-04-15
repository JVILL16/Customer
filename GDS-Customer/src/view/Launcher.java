package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import controller.CustomerController;
import javafx.application.Application;
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
		//code might be moved to another file if i can figure that out
		//this just sets prompts for the messages
		
		//note to self get rid of preselected text
		final TextField name = new TextField();
		name.setPromptText("First Name");
		name.setPrefColumnCount(20);
	    name.getText();
		GridPane.setConstraints(name, 0, 5);
		grid.getChildren().add(name);
		
		final TextField lastName = new TextField();
		lastName.setPromptText("Last Name");
		lastName.setPrefColumnCount(20);
	    lastName.getText();
		GridPane.setConstraints(lastName, 0, 10);
		grid.getChildren().add(lastName);
		
		final TextField email = new TextField();
		email.setPromptText("Email Address");
		email.setPrefColumnCount(20);
	    email.getText();
		GridPane.setConstraints(email, 0, 15);
		grid.getChildren().add(email);
		
		final TextField userName = new TextField();
		userName.setPromptText("Username");
		userName.setPrefColumnCount(20);
	    userName.getText();
		GridPane.setConstraints(userName, 0, 20);
		grid.getChildren().add(userName);
		
		//this is a specific class in java that allows for password protection
		final PasswordField pb = new PasswordField();
		pb.setPromptText("Password");
		pb.setPrefColumnCount(20);
	    pb.getText();
		GridPane.setConstraints(pb, 0, 25);
		grid.getChildren().add(pb);
		
		Button createAccount = new Button("Create Account");
		GridPane.setConstraints(createAccount, 0, 30);
		grid.getChildren().add(createAccount);
		createAccount.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle (ActionEvent e) {
			}
		});
		
		Button login = new Button("Have Login?");
		GridPane.setConstraints(login, 0, 35);
		grid.getChildren().add(login);
		login.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle (ActionEvent e) {
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
