module ru.dar237.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dar237.demo2 to javafx.fxml;
    exports ru.dar237.demo2;
}