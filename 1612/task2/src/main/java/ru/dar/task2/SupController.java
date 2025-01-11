package ru.dar.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import static java.lang.StrictMath.PI;
import static java.lang.StrictMath.sqrt;

public class SupController {

    @FXML
    private Label bLabel;

    @FXML
    private Label sLabel;

    @FXML
    private TextField sTextField;

    @FXML
    void sumDuttonOnAction(ActionEvent event) {

        float s=Float.parseFloat(sTextField.getText().toString());
        double d = sqrt(4 * s/ PI);
        double l = PI * d;
        sLabel.setText("Диаметр =" +d);
        bLabel.setText("Длина = " +l);

    }

}
