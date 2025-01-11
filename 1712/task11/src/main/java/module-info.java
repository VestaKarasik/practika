module ru.dar.task11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar.task11 to javafx.fxml;
    exports ru.dar.task11;
    exports ru.dar237.task1;
    opens ru.dar237.task1 to javafx.fxml;
}