package ru.dar.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SurController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Label sLabel;

    @FXML
    void sumDuttonOnAction(ActionEvent event) {

        float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextField.getText().toString());
        double x = -(b/a);
        sLabel.setText("S =" +x);

    }

}
