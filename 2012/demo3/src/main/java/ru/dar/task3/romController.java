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
    void sumButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aTextField.getText().toString());
        int b = Integer.parseInt(bTextField.getText().toString());
        int n=0;
        String s="";
            for (int i = b - 1; i > a; i--){
           s=s+i+",";
           n++;
            }
        aLabel.setText(s+" Таких чисел: "+String.valueOf(n));
//            int m = data.get(i);
//            if (i > a + 1) {
//                aString.add(", ");
        }
    }

