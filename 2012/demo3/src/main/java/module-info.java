module ru.dar237.demo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar237.demo3 to javafx.fxml;
    exports ru.dar237.demo3;
    exports ru.dar.task3;
    opens ru.dar.task3 to javafx.fxml;
}