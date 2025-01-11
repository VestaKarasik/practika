package dar237.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DemoController {

    @FXML
    private Button OkButton;
    List<Integer> data = dataListView.getItems();
    int max = 0;
    boolean foundZero = false;

        for (int number: data) {
        if (number == 0) {
            foundZero = true;
            break;
        }
        if (number % 7 == 0 && number % 10 == 2) {
            max += number;

        }
    }
         if (max != 0)
            answerLabel.setText(String.valueOf(max));
        else answerLabel.setText("Сумма чисел, кратных 7 и оканчивающихся на 2:" + max);
}

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<?> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {

    }

}
