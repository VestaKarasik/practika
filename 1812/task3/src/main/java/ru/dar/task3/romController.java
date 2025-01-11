package ru.dar.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class romController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextField.getText().toString());
        float c=Float.parseFloat(cTextField.getText().toString());
if ( a == b)
{ aLabel.setText("Порядковый номер 3"); }
else if ( a == c)
{aLabel.setText("Порядковый номер 2");}
else aLabel.setText("Порядковый номер 1");
    }

}
