package ru.dar.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ronController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int k=Integer.parseInt(aTextField.getText().toString());
        int n=(k + 3)% 7  ;
        aLabel.setText("День недели: " + n);
    }

}
