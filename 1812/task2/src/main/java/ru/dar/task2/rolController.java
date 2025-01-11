package ru.dar.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class rolController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int a=Integer.parseInt(aTextField.getText().toString());
        if (a > 0)
        { aLabel.setText("Число: " + (a - 8)); }
        else {aLabel.setText("Число: " + (a + 6));  }

    }

}
