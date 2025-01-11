module ru.dar.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar.task1 to javafx.fxml;
    exports ru.dar.task1;
}