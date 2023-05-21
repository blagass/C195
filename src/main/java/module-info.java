module c195 {
    requires javafx.controls;
    requires javafx.fxml;



    opens brandonlagasse.c195 to javafx.fxml;
    exports brandonlagasse.c195;

    opens brandonlagasse.c195.controller to javafx.fxml;
    exports brandonlagasse.c195.controller;
}