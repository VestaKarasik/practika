package ru.dar.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;

public class romaController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float x = Float.parseFloat(aTextField.getText().toString());
        float y = Float.parseFloat(bTextField.getText().toString());
        if ((pow(x,2) + pow(y,2) < 100 && y <= 0 ) || (y < abs(x) && y >= 0 && (pow(x,2) + pow(y,2) >100))) {
            aLabel.setText(" Точка внутри области");
        }
        else {
            aLabel.setText(" Точка вне области");
        }

    }
}
