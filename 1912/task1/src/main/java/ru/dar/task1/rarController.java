package ru.dar.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class rarController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int k = Integer.parseInt(aTextField.getText().toString());
        if (k == 1) {
            aLabel.setText("Плохо");
        } else if (k == 2) {
            aLabel.setText("Неудовлетворительно");
        } else if (k == 3) {
            aLabel.setText("Удовлетворительно");
        } else if (k == 4) {
            aLabel.setText("Хорошо");
        } else if (k == 5) {
            aLabel.setText("Отлично");
        } else
            aLabel.setText("Ошибка");


    }

}
