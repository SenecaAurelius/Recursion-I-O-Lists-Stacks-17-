module com.example.javafx_ui_controls_and_multimedia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_ui_controls_and_multimedia to javafx.fxml;
    exports com.example.javafx_ui_controls_and_multimedia;
}