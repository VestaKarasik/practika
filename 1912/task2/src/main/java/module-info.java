module ru.dar.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar.task2 to javafx.fxml;
    exports ru.dar.task2;
}