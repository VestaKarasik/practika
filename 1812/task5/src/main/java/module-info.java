module ru.dar.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar.task5 to javafx.fxml;
    exports ru.dar.task5;
}