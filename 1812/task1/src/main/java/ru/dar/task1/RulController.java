package ru.dar.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RulController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int a=Integer.parseInt(aTextField.getText().toString());
        if (a%10==7)
        { aLabel.setText("Число оканчивается на 7");}
        else {aLabel.setText("Число НЕ оканчивается на 7") ;}
    }

}
