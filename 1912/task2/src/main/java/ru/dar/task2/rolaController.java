package ru.dar.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class rolaController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label blabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int a=Integer.parseInt(aTextField.getText().toString());
        String s1="",s2="",s3="",s;
        if (a%10>=5)
            s3=" лет";
        else if (a%10==1)
            s3=" год";
        else if (a%10>=2)
            s3=" года";
        switch (a%10)
        {
            case 1:
                s2=" Один"; break;
            case 2:
                s2=" Два "; break;
            case 3:
                s2=" Три"; break;
            case 4:
                s2=" Четыре"; break;
            case 5:
                s2=" Пять"; break;
            case 6:
                s2=" Шесть"; break;
            case 7:
                s2=" Семь"; break;
            case 8:
                s2=" Восемь"; break;
            case 9:
                s2=" Девять"; break;
        }
        switch (a/10) {
            case 2:
                s1="Двадцать "; break;
            case 3:
                s1="Тридцать "; break;
            case 4:
                s1="Сорок"; break;
            case 5:
                s1="Пятьдесят"; break;
            case 6:
                s1="Шестьдесят"; break;

        }
        s=s1+s2+s3;
        blabel.setText(s);
    }

}
