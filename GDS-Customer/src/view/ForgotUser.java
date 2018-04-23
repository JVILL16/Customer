package view;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ForgotUser extends Application {
	
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
		
		Button createAccount = new Button("Send Email");
		GridPane.setConstraints(createAccount, 0, 30);
		grid.getChildren().add(createAccount);
			createAccount.setOnAction(e-> {
				if(email.getText() == null || email.getText().trim().isEmpty() )
				{
					System.out.println("Email field is empty");
				}
				else
				{
					Login login = new Login();
					try {
						login.start(primaryStage);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	

				}
	});

	}
}