module ru.dar.task12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar.task12 to javafx.fxml;
    exports ru.dar.task12;
    exports ru.dar237.task1;
    opens ru.dar237.task1 to javafx.fxml;
}