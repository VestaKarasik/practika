package ru.dar.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.StrictMath.pow;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Button goButton;

    @FXML
    private Label sLabel;

    @FXML
    void goButtonOnAction(ActionEvent event) {

  float a=Float.parseFloat(aTextField.getText().toString());
        sLabel.setText("s="+pow(a,2));
        //  sLabel.setText("");
    }

}
