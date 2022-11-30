package Boundry;

import java.io.IOException;
import java.util.ArrayList;

import client.ClientUI;
import client.GUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class POCcontroller {

	@FXML
	private TextField creditNumber;
	@FXML
	private TextField Id;
	@FXML
	private Button display_btn;

	@FXML
	private TextField subscriber_number;

	@FXML
	private TextArea textarea;

	@FXML
	private Button update_btn;

	@FXML
	void press_display(ActionEvent event) {

	}

	@FXML
	void press_update(ActionEvent event) {

		//FXMLLoader loader = new FXMLLoader();
		ArrayList<String> msg = new ArrayList<>();
		String creditNumber, subscriber_number, id;
		creditNumber = getCreditNumber();
		subscriber_number = getSubscriberNumber();
		id = getid();

		msg.add("update");
		msg.add(id);
		msg.add(subscriber_number);
		msg.add(creditNumber);
		GUI.chat.accept(msg);

	}

	private String getCreditNumber() {
		return creditNumber.getText();
	}

	private String getid() {
		return Id.getText();
	}

	private String getSubscriberNumber() {
		return subscriber_number.getText();
	}

	public void start(Stage stage) throws IOException {
		AnchorPane root = FXMLLoader.load(getClass().getResource("/Boundry/POC.fxml"));
		Scene scene = new Scene(root);
		// scene.getStylesheets().add(getClass().getResource("/Boundry/AcademicFrame.css").toExternalForm());
		stage.setTitle("Academic Managment Tool");
		stage.setScene(scene);
		stage.show();
	}

}
