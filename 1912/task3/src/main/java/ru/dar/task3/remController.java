package ru.dar.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.StrictMath.sqrt;

public class remController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float x = Float.parseFloat(bTextField.getText().toString());
        double a=0, c=0, h=0, s=0;
        int n = Integer.parseInt(aTextField.getText().toString());
switch (n) {

    case 1:
        a = x ;
        c = a * sqrt(2);
        h = c / 2.0;
        s = c * h / 2.0;
        break;
    case 2: //
        c = x ;
        a = c / sqrt(2);
        h = c / 2.0;
        s = c * h / 2.0;
        break;
    case 3:
        h = x;
        c = h * 2.0;
        a = c / sqrt(2);
        s = c * h / 2.0;
        break;
    case 4:
        s = x;
        c = sqrt(s * 4);
        a = c / sqrt(2);
        h = c / 2.0;
        break;
}
aLabel.setText("a="+String.valueOf(a)+" "+"s="+String.valueOf(s)+" "+"h="+String.valueOf(h)+" "+"c="+String.valueOf(c));
    }

}
