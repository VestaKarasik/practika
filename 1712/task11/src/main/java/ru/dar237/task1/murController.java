package ru.dar237.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class murController {

    @FXML
    private Label mLabel;

    @FXML
    private TextField mTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int m=Integer.parseInt(mTextField.getText().toString());
        mLabel.setText("Тонны: "+m / 1000);
    }

}
