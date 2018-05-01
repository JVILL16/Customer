package view;

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
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CheckOut {
public void start(Stage primaryStage) throws Exception {
		
		Pane rootPane = new Pane();
		Scene browseView = new Scene(rootPane, 1000, 900);
		primaryStage.setScene(browseView);
		primaryStage.setTitle("Grocery Delivery System");
		primaryStage.show();

	
		Label title = new Label("CheckOut");
		title.setFont(new Font("Arial" , 30));
		rootPane.getChildren().add(title);
		browseView.setRoot(rootPane);
		
		
		Label address =  new Label("Enter Address");
		address.setFont(new Font("Arial",20));
		address.relocate(0, 100);
		rootPane.getChildren().add(address);
		
		final TextField newAdd = new TextField();
		newAdd.setPromptText("Address");
		newAdd.relocate(0,120);
		rootPane.getChildren().add(newAdd);
		
		Label state =  new Label("Enter State");
		state.setFont(new Font("Arial",20));
		state.relocate(0, 200);
		rootPane.getChildren().add(state);
		
		final TextField newState = new TextField();
		newState.setPromptText("State");
		newState.relocate(0,220);
		rootPane.getChildren().add(newState);
		
		Label zip =  new Label("Enter Zip");
		zip.setFont(new Font("Arial",20));
		zip.relocate(0, 300);
		rootPane.getChildren().add(zip);
		
		final TextField newZip = new TextField();
		newZip.setPromptText("Zip");
		newZip.relocate(0,320);
		rootPane.getChildren().add(newZip);
		
		
		Label card =  new Label("Enter Card Number");
		card.setFont(new Font("Arial",20));
		card.relocate(0, 400);
		rootPane.getChildren().add(card);
		
		final TextField newCard = new TextField();
		newCard.setPromptText("Card Number");
		newCard.relocate(0,420);
		rootPane.getChildren().add(newCard);
		newCard.textProperty().addListener(new ChangeListener<String>() {
		    @Override
		    public void changed(ObservableValue<? extends String> observable, String oldValue, 
		        String newValue) {
		        if (!newValue.matches("\\d*")) {
		            newCard.setText(newValue.replaceAll("[^\\d]", ""));
		        }
		    }
		});
		
		Label expiration =  new Label("Enter Expiration Date");
		expiration.setFont(new Font("Arial",20));
		expiration.relocate(0, 500);
		rootPane.getChildren().add(expiration);
		
		final TextField newExpiration = new TextField();
		newExpiration.setPromptText("Card Expiration");
		newExpiration.relocate(0,520);
		rootPane.getChildren().add(newExpiration);
		
		
		Label cvn =  new Label("Enter CVN");
		cvn.setFont(new Font("Arial",20));
		cvn.relocate(0, 600);
		rootPane.getChildren().add(cvn);
		
		final TextField newCVN = new TextField();
		newCVN.setPromptText("Card CVN");
		newCVN.relocate(0,620);
		rootPane.getChildren().add(newCVN);
		
		
		
		Button order = new Button("Complete Your Order?");
		order.relocate(0,720);
		rootPane.getChildren().add(order);
		order.setOnAction(e-> {
			if(newAdd.getText() == null || newAdd.getText().trim().isEmpty() )
			{
				Label addressE =  new Label("NO ADDRESS");
				addressE.setFont(new Font("Arial",20));
				addressE.relocate(300,300);
				rootPane.getChildren().add(addressE);
			}
			else if(newState.getText() == null || newState.getText().trim().isEmpty())
			{
				Label stateE =  new Label("NO STATE");
				stateE.setFont(new Font("Arial",20));
				stateE.relocate(300,300);
				rootPane.getChildren().add(stateE);
			}
			else if(newZip.getText() == null || newZip.getText().trim().isEmpty())
			{
				Label zipE =  new Label("NO ZIP");
				zipE.setFont(new Font("Arial",20));
				zipE.relocate(300,300);
				rootPane.getChildren().add(zipE);
			}
			else if(newCard.getText() == null || newCard.getText().trim().isEmpty())
			{
				Label cardNE =  new Label("NO Card Number");
				cardNE.setFont(new Font("Arial",20));
				cardNE.relocate(300,300);
				rootPane.getChildren().add(cardNE);
			}
			else if(newExpiration.getText() == null || newExpiration.getText().trim().isEmpty())
			{
				Label cardE =  new Label("NO Card Expiration");
				cardE.setFont(new Font("Arial",20));
				cardE.relocate(300,300);
				rootPane.getChildren().add(cardE);
			}
			else if(newCVN.getText() == null || newCVN.getText().trim().isEmpty())
			{
				Label cvnE =  new Label("NO CVN");
				cvnE.setFont(new Font("Arial",20));
				cvnE.relocate(300,300);
				rootPane.getChildren().add(cvnE);
			}
			else {
				try {
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}		
		}
		});
	}
}
