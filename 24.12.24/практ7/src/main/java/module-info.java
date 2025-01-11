module ru.daryushina.daryushina_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.daryushina.daryushina_prakt7 to javafx.fxml;
    exports ru.daryushina.daryushina_prakt7;
    exports ru.daryushina.daryushina_prakt7.controller;
    opens ru.daryushina.daryushina_prakt7.controller to javafx.fxml;
}