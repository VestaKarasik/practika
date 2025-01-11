module ru.dar.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar.task3 to javafx.fxml;
    exports ru.dar.task3;
}