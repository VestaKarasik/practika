module dar237.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dar237.task1 to javafx.fxml;
    exports dar237.task1;
    exports ru.demo.demo;
    opens ru.demo.demo to javafx.fxml;
}