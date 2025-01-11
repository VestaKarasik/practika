module ru.demo.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.demo.demo to javafx.fxml;
    exports ru.demo.demo;
}