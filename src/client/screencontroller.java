package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class screencontroller {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private TextArea textArea;

    @FXML
    void press1(ActionEvent event) {
    	textArea.setText("11111");
    }

    @FXML
    void press2(ActionEvent event) {
    	textArea.setText("2222222");
    }

}
